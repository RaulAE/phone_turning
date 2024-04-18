package com.example.phone_turning

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Landscape or Portrait"

        val button1 = findViewById<Button>(R.id.button)

        val userInput: EditText = findViewById<TextInputEditText>(R.id.input)
        val display: TextView = findViewById<TextView>(R.id.display)
        button1.setOnClickListener {
            if(button1.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(
                    this@MainActivity,
                    "This is Portrait Mode",
                    Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "This is Landscape Mode",
                    Toast.LENGTH_SHORT).show()
                }
            val inputText = userInput.text.toString()


            display.text = "You typed: $inputText"

        }
    }
}