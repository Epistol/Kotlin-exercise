package com.example.mikal.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

fun String.isPalindrome() : Boolean{
    val lowerCaseText = this.toLowerCase()

    return lowerCaseText == lowerCaseText.reversed()
}

// ANDROID KTX


class MainActivity : AppCompatActivity() {



    val allDogs: List<Dog> by lazy {
        arrayListOf<Dog>()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = "toto"

        name = "Marie"

        val age = 21

//        age = 29  impossible

        var students = arrayOf("Marie", "Kylian", "Amelie")
        val students_bis = arrayListOf("Marie", "Kylian", "Amelie")

        students_bis.add("Tanguy")

        for (student in students_bis) {
            Log.d("Kot : ", student)
        }

        students_bis.removeAt(0) // Bye marie

        var title: String? = null
//        var length = title.length
        var length = title?.length
        // Si title?.length = entier avec valeur -> return value
        // else :
        // -> dans le doute, on retourne l'element après ?: (elvis operator) 0
        var length2 = title?.length ?: 0

        if(title is String){
            // Dans ce bloc title = String (non nullable)
            val length3 = title.length
        }

        var dogs = arrayListOf<Dog>()

        dogs.add(Dog("Toto", 2, "Herbert"))
        dogs.add(Dog("Toto2", 23, "Herbert"))

        val dogsWithName = dogs.filter{
            it.nickName != null
        }

        var myValue = 10

        when(myValue){
            1 -> {

            }
            in 2..9 -> {

            }
            10 -> {

            }
        }

        var text = "kayak"
        isPalindrome(text)

          }


    private fun isPalindrome(text: String) : Boolean{
        val lowerCaseText = text.toLowerCase()

        return lowerCaseText == lowerCaseText.reversed()
    }

}
