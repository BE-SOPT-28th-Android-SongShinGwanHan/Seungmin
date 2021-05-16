package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import api.ServiceCreator
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import request.RequestLoginData
import request.ResponseLoginData
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val functionName = object{}.javaClass.enclosingMethod.name
        printlog(functionName)

        binding.button.setOnClickListener{
            var Id = binding.editTextTextPersonName.text.toString()
            var Pw = binding.editTextTextPassword.text.toString()
            val intent2 = Intent(this, HomeActivity::class.java)
            if(Id.isNotBlank()&&Pw.isNotBlank()) {
                val requestLoginData = RequestLoginData(
                    id = binding.editTextTextPersonName.text.toString(),
                    password = binding.editTextTextPassword.text.toString()
                )
                val call = ServiceCreator.soptService
                    .postLogin(requestLoginData)
                call.enqueue(object: retrofit2.Callback<ResponseLoginData>{
                    override fun onFailure(call: Call<ResponseLoginData>, t: Throwable) {
                        TODO("Not yet implemented")
                    }

                    override fun onResponse(
                        call: Call<ResponseLoginData>,
                        response: Response<ResponseLoginData>
                    ) {
                        if(response.isSuccessful)
                        {
                            startActivity(intent2)
                        }
                        else{
                            Toast.makeText(this@MainInActivity, "아이디 혹은 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                        }
                    }

                })
            }
            else{
                Toast.makeText(this, "아이디 혹은 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textView5.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }




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
        val functionName=object {}.javaClass.enclosingMethod.name
        printlog(functionName)
    }

    fun printlog(funName:String)
    {
        Log.d(funName, "${funName}함수 SignInActivity에서 호출")
    }


}