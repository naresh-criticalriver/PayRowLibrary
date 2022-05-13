package com.example.payrowlibrary

import android.content.Context
import android.widget.Toast
import com.example.payrowlibrary.response.SimpleResponse

class Utils(val context: Context) {

    fun  showToast(msg: String){
        Toast.makeText(context,msg, Toast.LENGTH_LONG).show()
    }


    fun  getData(msg: String): SimpleResponse{
        val  res = SimpleResponse("SURESH", "33")

        return  res;
    }
}