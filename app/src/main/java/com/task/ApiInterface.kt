package com.task

import com.task.data.dto.products.ProductResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by Mahmod Masoud on 8/1/2022.
 */
interface ApiInterface {
    @GET("dynamodb-writer/")
    fun getProducts() : Call<List<ProductResponse>>
    companion object {
        var BASE_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/default/"
        fun create() : ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }
}