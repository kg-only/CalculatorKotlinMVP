package com.example.calculatorkotlinmvp.koin

import com.example.calculatorkotlinmvp.ui.CalculatorPresenter
import org.koin.core.module.Module
import org.koin.dsl.module

object MainModule {
    fun create(): Module = module {
        factory { CalculatorPresenter() }
    }
}