package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import api.ServiceCreator
import com.example.myapplication.databinding.ActivitySignUpBinding
import request.RequestSignupData
import request.ResponseSignupData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            var name = binding.editTextTextPersonName2.text.toString()
            var Id = binding.editTextTextPersonName3.text.toString()
            var Pw=binding.editTextTextPersonName4.text.toString()
            val intent3 = Intent(this, MainInActivity::class.java)
            if(name.isNotBlank()&&Id.isNotBlank()&&Pw.isNotBlank())
            {
                val requestSignupData = RequestSignupData(
                    Id,
                    Pw,
                    "0",
                    name,
                    "010-0000-0000",
                    "1999999"
                )

                val call = ServiceCreator.signUpService
                    .postSignup(requestSignupData)

                call.enqueue(object : Callback<ResponseSignupData>{
                    override fun onResponse(
                        call: Call<ResponseSignupData>,
                        response: Response<ResponseSignupData>
                    ) {
                        if(response.isSuccessful)
                        {
                            Toast.makeText(this@SignUpActivity, "Success!", Toast.LENGTH_SHORT).show()
                            startActivity(intent3)
                        }
                        else{
                            Toast.makeText(this@SignUpActivity, "Retry!", Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<ResponseSignupData>, t: Throwable) {
                        TODO("Not yet implemented")
                    }
                })
            }
            else{
                Toast.makeText(this, "빈칸이 있는지 확인해주세요", Toast.LENGTH_SHORT).show()
            }
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
        val function=object {}.javaClass.enclosingMethod.name
        printlog(function)
    }

    fun printlog(funName:String)
    {
        Log.d(funName, "${funName}함수 SignUpActivity에서 호출")
    }

}



