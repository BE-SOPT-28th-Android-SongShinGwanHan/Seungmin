package api

import com.google.gson.annotations.SerializedName
import request.LoginData
import request.RequestLoginData
import request.ResponseLoginData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
interface SoptService {
    @POST("/login/signin")
    fun postLogin(
        @Body body: RequestLoginData
    ): Call<ResponseLoginData>
}

