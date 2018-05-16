package com.example.mikal.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

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

        for(student in students_bis){
            Log.d("Kot : ", student)
        }

        students_bis.removeAt(0) // Bye marie

        var title: String? = null
//        var length = title.length
        var length = title?.length


    }
}
