package com.task.data.error.mapper

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */
interface ErrorMapperSource {
    fun getErrorString(errorId: Int): String
    val errorsMap: Map<Int, String>
}
