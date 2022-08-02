package com.task.data.remote

import com.task.data.Resource
import com.task.data.dto.products.ProductResponse

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */
internal interface RemoteDataSource {
    suspend fun requestProducts(): Resource<ProductResponse>
}
