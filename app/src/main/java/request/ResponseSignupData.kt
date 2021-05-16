package request

import com.google.gson.annotations.SerializedName

data class ResponseSignupData(
    val success:Boolean,
    val message:String,
    val data:SignupData?
)

data class SignupData(
    val nickname:String
)