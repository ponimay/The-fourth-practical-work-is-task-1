package com.example.laba4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)
        imageView1 = findViewById(R.id.imageView)
        imageView2 = findViewById(R.id.imageView2)

        val imageButton: ImageButton = findViewById(R.id.imageButton3)
        val editText: EditText = findViewById(R.id.editTextText2)
        val editText2: EditText = findViewById(R.id.editTextText3)


        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Hello friend"
            } else {
                textView.text = "Hello " + editText.text
            }
                if (editText2.text.toString() == "sad") {
                    imageView1.visibility = View.VISIBLE
                }
                if (editText2.text.toString() == "xorosho") {
                    imageView2.visibility = View.VISIBLE
                }

        }
    }
}