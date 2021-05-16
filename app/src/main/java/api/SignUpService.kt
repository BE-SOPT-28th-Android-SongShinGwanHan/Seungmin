package api

import com.google.gson.annotations.SerializedName
import request.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
interface SignUpService {
    @POST("/login/signup")
    fun postSignup(
        @Body body: RequestSignupData
    ): Call<ResponseSignupData>
}
