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
    fun  getData(msg: String): SimpleResponse{
      val  ss = SimpleResponse("SURESH", "33")
        //Toast.makeText(this,""+ss.name, Toast.LENGTH_LONG).show()
        val res: SimpleResponse = proguardTest(ss);

        return  res;
    }


    companion object{
        fun proguardTest(ss: SimpleResponse): SimpleResponse{
            return  ss;
        }
    }

}