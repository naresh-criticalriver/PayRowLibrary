package com.example.payrowapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.payrowlibrary.DashboardActivity
import com.example.payrowlibrary.Utils
import com.wizzitdigital.emv.sdk.EMVAdapter
import com.wizzitdigital.emv.sdk.EMVAdapterListener

class MainActivity : AppCompatActivity(),EMVAdapterListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DashboardActivity().showToast("Hello World")
        DashboardActivity.displayToast("Toast Msg",this);
        Utils(this).showToast("Welcome")

    }

    override fun onAdapterInitComplete(isInitialized: Boolean, reason: String) {
        TODO("Not yet implemented")
    }

    override fun onAdapterInitializing() {
        TODO("Not yet implemented")
    }

    override fun onCardProcessing() {
        TODO("Not yet implemented")
    }

    override fun onCardProcessingComplete() {
        TODO("Not yet implemented")
    }

    override fun onCardProcessingNotify(message: String) {
        TODO("Not yet implemented")
    }

    override fun onCardRemoved() {
        TODO("Not yet implemented")
    }

    override fun onCheckDeviceRegistrationComplete(
        isRegistered: Boolean,
        reason: String,
        merchantId: String,
        merchantCode: String,
        merchantName: String,
        terminalId: String
    ) {
        TODO("Not yet implemented")
    }

    override fun onDeviceRegistrationComplete(isRegistered: Boolean, reason: String) {
        TODO("Not yet implemented")
    }

    override fun onSessionComplete(
        isSuccessful: Boolean,
        statusCode: String,
        reason: String,
        sessionData: Map<String, String>
    ) {
        TODO("Not yet implemented")
    }

    override fun onSessionCountdown(remainingSeconds: Int) {
        TODO("Not yet implemented")
    }

    override fun onSessionInitComplete(isInitialized: Boolean, reason: String) {
        TODO("Not yet implemented")
    }

    override fun onSessionTimeout() {
        TODO("Not yet implemented")
    }
}