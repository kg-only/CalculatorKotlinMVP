package com.example.calculatorkotlinmvp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatorkotlinmvp.R
import com.example.calculatorkotlinmvp.mvp.BaseFragmentMvp
import kotlinx.android.synthetic.main.fragment_calculator.*
import net.objecthunter.exp4j.ExpressionBuilder
import org.koin.android.ext.android.inject

class CalculatorFragment :
    BaseFragmentMvp<CalculatorContract.View,
            CalculatorContract.Presenter>(), CalculatorContract.View {

    override val presenter: CalculatorPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ////numbers
        btn_0.setOnClickListener { setMathView("0") }
        btn_1.setOnClickListener { setMathView("1") }
        btn_2.setOnClickListener { setMathView("2") }
        btn_3.setOnClickListener { setMathView("3") }
        btn_4.setOnClickListener { setMathView("4") }
        btn_5.setOnClickListener { setMathView("5") }
        btn_6.setOnClickListener { setMathView("6") }
        btn_7.setOnClickListener { setMathView("7") }
        btn_8.setOnClickListener { setMathView("8") }
        btn_9.setOnClickListener { setMathView("9") }
        ////operator
        btn_minus.setOnClickListener { setMathView("-") }
        btn_plus.setOnClickListener { setMathView("+") }
        btn_multiply.setOnClickListener { setMathView("*") }
        btn_divide.setOnClickListener { setMathView("/") }
        btn_percent.setOnClickListener { setMathView("%") }
        ////operations
        btn_clear.setOnClickListener {
            clear("")//create value
        }

        btn_equals.setOnClickListener {
            presenter.equals(math_operation, result_text)
        }

        btn_delete.setOnClickListener {
            presenter.delete(math_operation)
        }
    }

    override fun clear(text: String) {
        math_operation.text = text
        result_text.text = text
    }


    private fun setMathView(str: String) {
        if (result_text.text != "") {
            math_operation.text = result_text.text
            result_text.text = ""
        }
        math_operation.append(str)
    }
}
