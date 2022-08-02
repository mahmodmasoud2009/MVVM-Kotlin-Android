package com.task.ui.component.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.task.databinding.SplashLayoutBinding
import com.task.ui.base.BaseActivity
import com.task.SPLASH_DELAY
import com.task.ui.component.products.ProductsListActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */

@AndroidEntryPoint
class SplashActivity : BaseActivity(){

    private lateinit var binding: SplashLayoutBinding

    override fun initViewBinding() {
        binding = SplashLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToMainScreen()
    }

    override fun observeViewModel() {
    }

    private fun navigateToMainScreen() {
        Handler().postDelayed({
            val nextScreenIntent = Intent(this, ProductsListActivity::class.java)
            startActivity(nextScreenIntent)
            finish()
        }, SPLASH_DELAY.toLong())
    }
}
