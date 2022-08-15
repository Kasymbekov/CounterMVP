package com.example.countermvp.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.countermvp.databinding.ActivityMainBinding
import com.example.countermvp.helper.Injector
import com.example.countermvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun updateText(count: Int) {
        binding.counter.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun toGreenText() {
        binding.counter.setTextColor(Color.GREEN)
    }

    override fun toGrayText() {
        binding.counter.setTextColor(Color.GRAY)
    }


}