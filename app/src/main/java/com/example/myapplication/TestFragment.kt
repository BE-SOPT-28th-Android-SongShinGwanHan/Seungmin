package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup

class TestFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_fragment)

        val blankFragment=BlankFragment()

        val transaction=supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment, blankFragment)
        transaction.commit()
    }
}