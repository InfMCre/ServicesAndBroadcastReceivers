package com.example.servicesandbroadcastreceivers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicesandbroadcastreceivers.broadcastreceivers.BroadcastReceiversActivity
import com.example.servicesandbroadcastreceivers.databinding.ActivityMainBinding
import com.example.servicesandbroadcastreceivers.services.ServicesActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnServices.setOnClickListener {
            startActivity(Intent(this, ServicesActivity::class.java))
        }
        binding.btnReceivers.setOnClickListener {
            startActivity(Intent(this, BroadcastReceiversActivity::class.java))
        }
    }
}