package com.example.calculatorkotlinmvp.mvp

import androidx.annotation.AnimRes

interface BaseFragmentContract {
    fun overrideEnterAnimation(@AnimRes animation: Int)
    fun overrideExitAnimation(@AnimRes animation: Int)
}