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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.kotlin2025.ui.theme.Kotlin2025Theme

const val WEEK2TAG = "week02"
const val WEEK3TAG = "week03"
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
        //week02Variables()
        //week02Functions()
        week03Classes()
        week03Collections()
    }
}

fun week03Collections(){
    Log.d(WEEK3TAG, "===week03 collections===")

    val fruits = listOf("apple", "banana", "orange")
    // fruits.add("kiwi") => err listOf는 add가 안됨
    val mutableFruits = mutableListOf("kiwi", "orange")
    mutableFruits.add("mango")

    Log.d(WEEK3TAG, "Fruits : $fruits")
    Log.d(WEEK3TAG, "Mutable Fruits : $mutableFruits")

    val scores = mapOf("kim" to 97, "lee" to 10, "bak" to 50)
    Log.d(WEEK3TAG, "Scores : $scores")
    //for(fruit in fruits) Log.d(WEEK3TAG, "fruit : $fruit")
    for(fruit in mutableFruits) Log.d(WEEK3TAG, "mutable fruit : $fruit")
    scores.forEach{(name, score) -> Log.d(WEEK3TAG, "$name scored $score")}
}

fun week03Classes(){
    Log.d(WEEK3TAG, "===week03 classes===")

    class Student{
        var name : String = ""
        var age : Int = 0
        fun introduce() = Log.d(WEEK3TAG, "hello i'm $name and $age yeas old")
    }
    val student1 = Student()
    student1.name = "Kim"
    student1.age = 11
    student1.introduce()

//    data class Person(val name : String, val age : Int)
//
//    val person1 = Person("Lee", 22)
//    val person2 = Person(name= "Lee", age = 22)
//
//    Log.d(WEEK3TAG, "Person : $person1")
//    Log.d(WEEK3TAG, "Equal? : ${person1 == person2}")
    class Person(val name: String, var age:Int){
        fun introduce() = Log.d(WEEK3TAG, "Hello! $name $age years old")
        fun birth(){
            age++
            Log.d(WEEK3TAG, "Today is $name's birthday, now $age")
        }

    }
    val p1 = Person("Hong", 11)
    p1.introduce()
    p1.birth()

    open class Animal(var species: String){
        var weight: Double = 0.0
        constructor(species: String, weight: Double) : this(species){
            this.weight = weight
            Log.d(WEEK3TAG, "$species 의 무게 : 이제 $weight kg")
        }
        open fun makeSound(){
            Log.d(WEEK3TAG, "$species 가 소리를 냅니다")
        }
    }
    class Dog(species: String, weight: Double, val breed: String) : Animal(species, weight){
        override fun makeSound() {
            Log.d(WEEK3TAG, "$breed ($species)가 멍멍 짖습니다")
        }
    }
    val puppy = Animal("강아지", 6.5)
    puppy.makeSound()
    val dog = Dog("개",12.5,"골든 리트리버")
    dog.makeSound()
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

    Log.d(WEEK2TAG, "Age : $age Height : $height isStudent : $isStudent")
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