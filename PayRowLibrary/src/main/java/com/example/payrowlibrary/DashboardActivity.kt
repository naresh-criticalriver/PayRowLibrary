package com.example.payrowlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.payrowlibrary.response.SimpleResponse

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val res = getData(this);
    }
    fun  showToast(msg: String){
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
    }
    companion object {
        fun getData(activity: DashboardActivity): SimpleResponse {

            return SimpleResponse("SURESH", "33")
        }
    }

}