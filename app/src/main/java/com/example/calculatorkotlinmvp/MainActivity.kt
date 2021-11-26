package com.example.calculatorkotlinmvp

import android.os.Bundle
import com.example.calculatorkotlinmvp.mvp.BaseActivity
import com.example.calculatorkotlinmvp.ui.CalculatorFragment

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(CalculatorFragment())
    }
}
