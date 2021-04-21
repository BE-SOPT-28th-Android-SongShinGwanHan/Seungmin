package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val functionName = object{}.javaClass.enclosingMethod.name
        printlog(functionName)
    }

    override fun onStart() {
        super.onStart()
        val function=object {}.javaClass.enclosingMethod.name
        printlog(function)
    }

    override fun onResume() {
        super.onResume()
        val function=object {}.javaClass.enclosingMethod.name
        printlog(function)
    }

    override fun onPause() {
        super.onPause()
        val function=object {}.javaClass.enclosingMethod.name
        printlog(function)
    }

    override fun onStop() {
        super.onStop()
        val function=object {}.javaClass.enclosingMethod.name
        printlog(function)
    }

    override fun onDestroy() {
        super.onDestroy()
        val function=object {}.javaClass.enclosingMethod.name
        printlog(function)
    }

    fun printlog(funName:String)
    {
        Log.d(funName, "${funName}함수 HomeActivity에서 호출")
    }

}