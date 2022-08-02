package com.task.ui.base

import androidx.lifecycle.ViewModel
import com.task.usecase.errors.ErrorManager
import javax.inject.Inject

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */


abstract class BaseViewModel : ViewModel() {
    /**Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @Inject
    lateinit var errorManager: ErrorManager
}
