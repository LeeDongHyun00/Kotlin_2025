package com.appweek04

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        val layoutMain = findViewById<LinearLayout>(R.id.layoutMain)
        val textViewCurrentColor = findViewById<TextView>(R.id.textViewCurrentColor)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val redBtn = findViewById<Button>(R.id.redBtn)
        val blueBtn = findViewById<Button>(R.id.blueBtn)
        val greenBtn = findViewById<Button>(R.id.greenBtn)

        fun changeBackground(color : Int, colorName : String){
            layoutMain.setBackgroundColor(color)
            textViewCurrentColor.text = "현재 색 : $colorName"
            Log.d(TAG, "현재 색 : $colorName")
        }
        redBtn.setOnClickListener{
            changeBackground(Color.RED, redBtn.text.toString())
        }
        greenBtn.setOnClickListener{
            changeBackground(Color.GREEN, greenBtn.text.toString())
        }
        blueBtn.setOnClickListener{
            changeBackground(Color.BLUE, blueBtn.text.toString())
        }
        resetBtn.setOnClickListener{
            changeBackground(Color.WHITE, "White")
        }
    }
}