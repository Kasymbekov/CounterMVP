package com.example.countermvp.presenter

import com.example.countermvp.helper.Injector
import com.example.countermvp.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showToast(model.count)
        view.changeColor(model.count)
        view.updateText(model.count)
    }

    fun decrement() {
        model.decrement()
        view.showToast(model.count)
        view.changeColor(model.count)
        view.updateText(model.count)
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

}