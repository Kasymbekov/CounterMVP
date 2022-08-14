package com.example.countermvp.view

interface CounterView {

    fun updateText(count: Int)
    fun showToast(num: Int)
    fun changeColor(count: Int)
}