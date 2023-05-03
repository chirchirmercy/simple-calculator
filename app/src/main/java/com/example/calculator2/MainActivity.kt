//package com.example.simplecalculator
//
//import android.R
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
// public class MainActivity : AppCompatActivity(), View.OnClickListener {
//    var buttonAdd: Button? = null
//    var buttonSub: Button? = null
//    var buttonMul: Button? = null
//    var buttonDiv: Button? = null
//    var editTextN1: EditText? = null
//    var editTextN2: EditText? = null
//    var textView: TextView? = null
//    var num1 = 0
//    var num2 = 0
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.)
//        buttonAdd = findViewById(R.id.btn_add)
//        buttonSub = findViewById(R.id.btn_sub)
//        buttonMul = findViewById(R.id.btn_mul)
//        buttonDiv = findViewById(R.id.btn_div)
//        editTextN1 = findViewById(R.id.number1)
//        editTextN2 = findViewById(R.id.number2)
//        textView = findViewById(R.id.answer)
//        buttonAdd.setOnClickListener(this)
//        buttonSub.setOnClickListener(this)
//        buttonMul.setOnClickListener(this)
//        buttonDiv.setOnClickListener(this)
//    }
//
//    fun getIntFronEditText(editText: EditText?): Int {
//        return if (editText!!.text.toString() == "") {
//            Toast.makeText(this, "Enter number", Toast.LENGTH_LONG).show()
//            0
//        } else editText.text.toString().toInt()
//    }
//
//    override fun onClick(view: View) {
//        num1 = getIntFronEditText(editTextN1)
//        num2 = getIntFronEditText(editTextN2)
//    }
//}













//package com.example.calculator2
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
// class MainActivity : AppCompatActivity() {
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}