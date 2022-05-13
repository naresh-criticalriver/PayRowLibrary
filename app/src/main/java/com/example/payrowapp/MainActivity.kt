package com.example.payrowapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.payrowlibrary.DashboardActivity
import com.example.payrowlibrary.Utils
import com.example.payrowlibrary.response.SimpleResponse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DashboardActivity().showToast("Hello World")
        Utils(this).showToast("Welcome")


        val  res = SimpleResponse("SURESH", "33")

        DashboardActivity().getData(res);


    }



}