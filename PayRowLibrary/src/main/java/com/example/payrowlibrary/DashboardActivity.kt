package com.example.payrowlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.payrowlibrary.response.SimpleResponse

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
    fun  showToast(msg: String){
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
    }
    /*fun getData(): SimpleResponse{
        val  res = SimpleResponse("SURESH", "33")

        return res
    }*/
}