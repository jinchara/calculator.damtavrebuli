package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var kalkulatori: TextView
    private var operand = 0.0
    private var operation =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kalkulatori=findViewById(R.id.textView0)
    }
    fun saxeli (clickedView:View){
        if(clickedView is TextView){

           var text = kalkulatori.text.toString()
            val number = clickedView.text.toString()
            var result = text + number
            kalkulatori.text = result
            if (text == "0") {
                text == ""
            }


        }
    }
    fun operation1 (clickedView: View){
        if (clickedView is TextView){
            operand = kalkulatori.text.toString().toDouble()
            operation = clickedView.text.toString()
            kalkulatori.text=""


        }
    }

    fun equals(clickedView: View){
        val secondOperand= kalkulatori.text.toString().toDouble()
        when(operation) {
            "+" -> kalkulatori.text = (operand + secondOperand).toString()
            "-" -> kalkulatori.text = (operand - secondOperand).toString()
            "/" -> kalkulatori.text = (operand / secondOperand).toString()
            "*" -> kalkulatori.text = (operand * secondOperand).toString()


        }


    }
    fun clear(clickedView: View){
        val nuli="0"
        operand=nuli.toDouble()
        kalkulatori.text=nuli
    }
    fun wertili(clickedView: View){
        val wert = ".".toString()
        val atwiladi = kalkulatori.text.toString()
        kalkulatori.text =( atwiladi + wert ).toString()


    }
    fun delete(clickedView: View){
        val sigrdze =  kalkulatori.length()
        if (sigrdze > 0){
            kalkulatori.text = kalkulatori.text.subSequence(0 , sigrdze-1)


        }

    }


}