package com.example.servicesandbroadcastreceivers.services.ejemplo1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.servicesandbroadcastreceivers.databinding.ActivityServicesEjemplo1Binding

class Ejemplo1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityServicesEjemplo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnServicioEjemplo1.setOnClickListener {
            backgroundProcessing()
        }

        MyDataHolder.textLiveData.observe(this) { newText ->
            binding.tvSeEjemplo1Resultado.text = newText
        }
    }

    private fun backgroundProcessing() {
        val serviceIntent = Intent(this, BackgroundService::class.java)
        startService(serviceIntent)
    }
}