package com.example.easytable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easytable.fragments.FragmentHomePage

class MainActivity : AppCompatActivity() {


    val frg = FragmentHomePage()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager?.beginTransaction()
            .replace(R.id.change, frg)
            .commit()
    }
}