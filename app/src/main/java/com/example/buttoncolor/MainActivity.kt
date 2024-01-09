package com.example.buttoncolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val btnAdd = findViewById<Button>(R.id.btnAdd)

        pressingButton(btnAdd)
    }



    private fun pressingButton(btnAdd: Button) {
        val tvNumber = findViewById<TextView>(R.id.tvNumber)
        var numberValue = 0

        btnAdd.setOnClickListener {
            numberValue++

            tvNumber.text = numberValue.toString()

            randomizingColor()
        }
    }


    private fun randomizingColor() {
        val principalLinear = findViewById<LinearLayout>(R.id.principalLinear)
        var randomColor = "#"

        for (i in 1..8){

            randomColor += (Random().nextInt((9 + 1))).toString()

        }

        principalLinear.setBackgroundColor(Color.parseColor(randomColor))
    }
}