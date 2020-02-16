package ru.skillbranch.devintensive.pizzarecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pizza2.*

class Pizza2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza2)

        val txt = intent.getStringExtra("Extra")
        val name = intent.getStringExtra("Name")

        textView3.text = txt
        textView4.text = name
    }
}
