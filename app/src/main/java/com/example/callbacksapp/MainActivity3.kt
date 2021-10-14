package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {

    val Tag = "Activity 3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Toast.makeText(this, "onCreate $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onCreate:")
    }//end oncreate
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

}//end class