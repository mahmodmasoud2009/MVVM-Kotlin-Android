package com.task.usecase.errors

import com.task.data.error.Error

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */

interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}
