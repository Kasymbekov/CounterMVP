package com.example.countermvp.presenter

import com.example.countermvp.helper.Injector
import com.example.countermvp.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.updateText(model.count)
        checkCounter()
    }

    fun decrement() {
        model.decrement()
        view.updateText(model.count)
        checkCounter()
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

    private fun checkCounter() {
        when (model.count) {
            10 -> view.showToast()
            15 -> view.toGreenText()
            else -> view.toGrayText()
        }
    }
}