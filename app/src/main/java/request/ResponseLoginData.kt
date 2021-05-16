package request

import com.google.gson.annotations.SerializedName

data class ResponseLoginData(
    val success:Boolean,
    val message:String,
    val data:LoginData?
)

data class LoginData(
    @SerializedName("UserId")
    var userId: Int,
    val user_nickname:String,
    val token: String
)