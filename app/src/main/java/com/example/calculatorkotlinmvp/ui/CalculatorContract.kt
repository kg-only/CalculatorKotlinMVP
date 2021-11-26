package com.example.calculatorkotlinmvp.ui

import android.widget.TextView
import com.example.calculatorkotlinmvp.mvp.MvpView
import com.example.calculatorkotlinmvp.mvp.MvpPresenter

interface CalculatorContract {

    interface View : MvpView {
        fun clear(text:String)
    }

    interface Presenter : MvpPresenter<View> {
        fun equals(mathView:TextView, resultView:TextView,)
        fun delete(mathView:TextView)
    }
}