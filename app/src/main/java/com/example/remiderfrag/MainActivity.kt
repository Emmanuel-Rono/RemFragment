package com.example.remiderfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //instance of the fragments
        val frag1=Fragment1()
        val frag2=Fragment2()
        //Get the views
        val button1=findViewById<Button>(R.id.button)
        val button2=findViewById<Button>(R.id.button2)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, frag1)
            commit()
        }
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,frag1)
                addToBackStack(null)
                commit()
            }
        }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,frag2)
                addToBackStack(null)
                commit()
            }
        }
    }
}