package com.student.recipes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.recipeText)
        val jsonString = assets.open("recipes.json").bufferedReader().use { it.readText() }
        textView.text = "Gastronomi Tarif Deposu Yüklendi!\n\n" + jsonString
    }
}
