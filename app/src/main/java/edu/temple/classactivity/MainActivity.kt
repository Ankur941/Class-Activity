package edu.temple.classactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.messageTextView)
        val editView =  findViewById<EditText>(R.id.editTextText)

        findViewById<Button>(R.id.button).setOnClickListener{
            textView.text = if(editText.text.isEmpty()){
                "Hello" + editText.text + "!Welcome"
            }else{
                "Please enter your name"
            }
        }
    }
}