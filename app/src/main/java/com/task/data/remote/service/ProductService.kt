package com.task.data.remote.service
import com.task.data.dto.products.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */

interface ProductService {
    @GET("dynamodb-writer/")
    suspend fun fetchProducts(): Response<ProductResponse>
}