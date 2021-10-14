package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    lateinit var ToActivity3btn: Button
    val Tag = "Activity 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "onCreate $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onCreate:")
        ToActivity3btn = findViewById<Button>(R.id.ToActivity2btn)
        ToActivity3btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                startActivity(intent)
            }
        })
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onDestroy: ")
    }
}