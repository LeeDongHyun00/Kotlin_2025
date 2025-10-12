package com.appweek04

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val greetBtn = findViewById<Button>(R.id.greetBtn)
        val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)

        greetBtn.setOnClickListener{
            val name= editTextName.text.toString().trim()
            var greet :String = ""
            if (name.isNotEmpty()) {greet = "hello $name"}
            else {greet = "what's your name?"}
            textViewGreeting.text = greet
            textViewGreeting.visibility=View.VISIBLE
            Log.d(TAG, "${textViewGreeting.text}")
        }

    }
}