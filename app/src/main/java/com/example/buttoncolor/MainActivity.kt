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

        val buttonToPress = findViewById<Button>(R.id.buttonToPress)

        pressingButton(buttonToPress)
    }



    private fun pressingButton(pressButton: Button) {
        val numberView = findViewById<TextView>(R.id.numberView)
        var numberValue = 0

        pressButton.setOnClickListener {
            numberValue++

            numberView.text = numberValue.toString()

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