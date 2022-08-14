package com.example.countermvp.model

import com.example.countermvp.view.CounterView

class CounterModel {
    var count = 0

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

}