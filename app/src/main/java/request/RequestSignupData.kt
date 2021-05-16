package request

import com.google.gson.annotations.SerializedName

data class RequestSignupData (
    @SerializedName("email")
    val id:String,
    val password:String,
    val sex: String,
    val nickname:String,
    val phone:String,
    val birth:String
)