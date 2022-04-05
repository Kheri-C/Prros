package com.example.prros.response

import com.google.gson.annotations.SerializedName

data class PerroResponse(@SerializedName("status") var status: String,
                         @SerializedName("message") var imagenes: List<String>)
