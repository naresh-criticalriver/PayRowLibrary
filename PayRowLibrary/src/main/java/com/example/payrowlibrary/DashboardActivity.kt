package com.example.payrowlibrary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DashboardActivity : AppCompatActivity() {

    companion object{
       fun displayToast(msg:String,context: Context){
           val intent = Intent(context, DashboardActivity::class.java)
           intent.putExtra("toast",msg)
           context.startActivity(intent)
       }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val toastValue = intent.getStringExtra("toast")
        toastValue?.let {
            if(it.isNotEmpty())
            showToast(it)
        }
    }
    fun  showToast(msg: String){
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
    }
}