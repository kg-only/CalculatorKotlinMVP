package com.example.calculatorkotlinmvp.ui

import android.util.Log
import android.widget.TextView
import com.example.calculatorkotlinmvp.mvp.BasePresenter
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorPresenter : BasePresenter<CalculatorContract.View>(),
    CalculatorContract.Presenter {

    override fun equals(mathView: TextView, resultView: TextView) {
        try {
            val ex = ExpressionBuilder(mathView.text.toString()).build()
            val result = ex.evaluate()
            val longRes = result.toLong()
            if (result == longRes.toDouble()) {
                resultView.text = longRes.toString()
            } else resultView.text = result.toString()

        } catch (e: Exception) {
            Log.d("Ошибка", "ОШИБКА: ${e.message}")
        }
    }

    override fun delete(mathView: TextView) {
        val str = mathView.text.toString()
        if (str.isNotEmpty())
            mathView.text = str.substring(0, str.length - 1)
    }

}