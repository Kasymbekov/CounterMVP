package com.example.countermvp.view

interface CounterView {

    fun updateText(count: Int)
    fun showToast()
    fun toGreenText()
    fun toGrayText()
}