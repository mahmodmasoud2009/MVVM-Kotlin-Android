package com.task.data
import com.task.data.dto.products.ProductResponse
import kotlinx.coroutines.flow.Flow

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */

interface DataRepositorySource {
    suspend fun requestProducts(): Flow<Resource<ProductResponse>>
    suspend fun addToFavourite(id: String): Flow<Resource<Boolean>>
    suspend fun removeFromFavourite(id: String): Flow<Resource<Boolean>>
    suspend fun isFavourite(id: String): Flow<Resource<Boolean>>
}
