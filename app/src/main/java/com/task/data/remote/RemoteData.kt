package com.task.data.remote
import com.task.data.Resource
import com.task.data.dto.products.ProductResponse
import com.task.data.dto.products.ProductsItem
import com.task.data.error.NETWORK_ERROR
import com.task.data.error.NO_INTERNET_CONNECTION
import com.task.data.remote.service.ProductService
import com.task.utils.NetworkConnectivity
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

/**
 * Created by Mahmoud Masoud on 7/31/2022.
 */

class RemoteData @Inject
constructor(private val serviceGenerator: ServiceGenerator, private val networkConnectivity: NetworkConnectivity) : RemoteDataSource {
    override suspend fun requestProducts(): Resource<ProductResponse> {
        val productService = serviceGenerator.createService(ProductService::class.java)
        return when (val response = processCall(productService::fetchProducts)) {
            is List<*> -> {
                Resource.Success(data = ProductResponse(response as List<ProductsItem>))
            }
            else -> {
                Resource.DataError(errorCode = 101)
            }
        }
    }

    private suspend fun processCall(responseCall: suspend () -> Response<*>): Any? {
        if (!networkConnectivity.isConnected()) {
            return NO_INTERNET_CONNECTION
        }
        return try {
            val response = responseCall.invoke()
            val responseCode = response.code()
            if (response.isSuccessful) {
                response.body()
            } else {
                responseCode
            }
        } catch (e: IOException) {
            NETWORK_ERROR
        }
    }

}


