package com.example.servicesandbroadcastreceivers.broadcastreceivers.ejemplo3

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.servicesandbroadcastreceivers.databinding.ActivityReceiversEjemplo3Binding

class Ejemplo3Activity : AppCompatActivity() {
    lateinit var myReceiver: Receiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityReceiversEjemplo3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        myReceiver = Receiver()

        val filter = IntentFilter("com.devexperto.modulo4.MY_ACTION")
        registerReceiver(myReceiver, filter)

        MyDataHolder.textLiveData.observe(this) { newText ->
            binding.tvResultado.text = newText
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myReceiver)
    }
}