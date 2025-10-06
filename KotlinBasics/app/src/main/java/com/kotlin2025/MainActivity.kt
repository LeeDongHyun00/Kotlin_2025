package com.kotlin2025

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlin2025.ui.theme.Kotlin2025Theme

const val WEEK2TAG = "week02"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin2025Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week02Variables()
        week02Functions()
    }
}
fun week02Functions(){
    Log.d(WEEK2TAG, "week02 function")

    fun introduce(name : String, age : Int) : String{
        return "Hello Name : $name Age : $age"
    }
    fun add(a : Int, b: Int) : Int = a + b

    Log.d(WEEK2TAG, "introduce : ${introduce("Lee", 11)}")
    Log.d(WEEK2TAG, "add : ${add(1, 10)}")
}
fun week02Variables(){
    Log.d(WEEK2TAG, "week02 Variables")
//    val courseName =  "Mobile"
//    var week = 1
//    week = 2
//    Log.d(TAG, "$courseName : $week")
    val name = "Android"
    val version = 8.0

    Log.d(WEEK2TAG, "Hello $name $version")

    val age : Int = 11
    val height : Double = 11.11
    val isStudent : Boolean = true

    Log.d(WEEK2TAG, "Age : $age Height : $height isStudnet : $isStudent")
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kotlin2025Theme {
        Greeting("Android")
    }
}