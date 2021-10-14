package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

/*
1- Create two Activities 2- Create one button in the first Activity

2- The button will take you to the next Activity when clicked

3- Show a Toast message and log a message indicating the current state of both activities.

4- Traverse between the two Activities and check the log and toast messages

5- Rotate the screen and go back to the Android home screen and investigate the changes in states
Bonus :

1- Create a third Activity

2- Create a button in the second Activity that will take you to the third activity when clicked.

3- Investigate the changes of the activity state when (Rotate, go to third activity, go to home screen).
 */

class MainActivity : AppCompatActivity() {

    lateinit var ToActivity2btn: Button
    val Tag = "Activity 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onCreate:")
        ToActivity2btn = findViewById<Button>(R.id.ToActivity2btn)
        ToActivity2btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        })
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