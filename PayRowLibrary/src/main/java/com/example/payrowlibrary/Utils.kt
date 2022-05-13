package com.example.payrowlibrary

import android.content.Context
import android.widget.Toast

  class Utils(val context: Context) {

    fun  showToast(msg: String){
        Toast.makeText(context,msg, Toast.LENGTH_LONG).show()
    }
}