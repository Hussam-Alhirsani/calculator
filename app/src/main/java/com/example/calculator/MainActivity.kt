package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAdd.setOnClickListener() {
            Add()
        }
        binding.btnSubtract.setOnClickListener() {
            Sub()
        }
        binding.btnMultiply.setOnClickListener() {
            Multy()
        }
        binding.btnDivide.setOnClickListener() {
            Div()
        }
        binding.btnCalculate.setOnClickListener( ) {
            calculate()
        }

    }

    private fun calculate() {
        val stringInTextField = binding.edt1.toString()
        val cost = stringInTextField.toDouble()    }

    private fun Add() {
        val edtFirstNum = binding.edt1.text.toString()
        val edtFirst = edtFirstNum.toDouble()
        val edtSecondNumber = binding.edt2.text.toString()
        val edtSecond = edtSecondNumber.toDouble()
        var result = edtFirst + edtSecond
        printResult(edtFirst, edtSecond, result)

    }

    private fun Sub() {
        val edtFirstNum = binding.edt1.text.toString()
        val edtFirst = edtFirstNum.toDouble()
        val edtSecondNumber = binding.edt2.text.toString()
        val edtSecond = edtSecondNumber.toDouble()
        var result = edtFirst - edtSecond
        printResult(edtFirst, edtSecond, result)
    }

    private fun Multy() {
        val edtFirstNum = binding.edt1.text.toString()
        val edtFirst = edtFirstNum.toDouble()
        val edtSecondNumber = binding.edt2.text.toString()
        val edtSecond = edtSecondNumber.toDouble()
        var result = edtFirst * edtSecond
        printResult(edtFirst, edtSecond,result)
    }

    private fun Div() {
        val edtFirstNum = binding.edt1.text.toString()
        val edtFirst = edtFirstNum.toDouble()
        val edtSecondNumber = binding.edt2.text.toString()
        val edtSecond = edtSecondNumber.toDouble()
        var result = edtFirst / edtSecond
        printResult(edtFirst, edtSecond,result)
    }
    private fun printResult(edtFirst: Double, edtSecond: Double, result: Double) {
        binding.textv.text = { result }.toString()

    }
}