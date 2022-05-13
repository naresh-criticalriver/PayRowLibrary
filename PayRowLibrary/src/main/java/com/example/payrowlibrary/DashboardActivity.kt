package com.example.payrowlibrary

import android.content.Context
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

    fun getData(res: SimpleResponse): SimpleResponse {

        return res;
    }
    companion object{
        fun specialToast(context: Context, string: String) {
            Toast.makeText(context, string, Toast.LENGTH_LONG).show()
        }
    }
}