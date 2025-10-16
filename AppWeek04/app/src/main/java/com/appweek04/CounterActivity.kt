package com.appweek04

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CounterActivity : AppCompatActivity() {
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val counterTextView = findViewById<TextView>(R.id.counterTextView)
        val plus = findViewById<Button>(R.id.plusBtn)
        val minus = findViewById<Button>(R.id.minusBtn)
        val reset = findViewById<Button>(R.id.resetBtn)

        plus.setOnClickListener{
            count++
            counterTextView.text = count.toString()
            Log.d(TAG, "plusBtn : ${count}")
        }
        minus.setOnClickListener{
            count--
            counterTextView.text = count.toString()
            Log.d(TAG, "minusBtn : ${count}")
        }
        reset.setOnClickListener {
            count = 0
            counterTextView.text = count.toString()
            Log.d(TAG, "resetBtn : ${count}")
        }

    }
}