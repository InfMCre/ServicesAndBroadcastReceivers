package com.example.servicesandbroadcastreceivers.broadcastreceivers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicesandbroadcastreceivers.broadcastreceivers.ejemplo1.Ejemplo1Activity
import com.example.servicesandbroadcastreceivers.broadcastreceivers.ejemplo2.Ejemplo2Activity
import com.example.servicesandbroadcastreceivers.broadcastreceivers.ejemplo3.Ejemplo3Activity
import com.example.servicesandbroadcastreceivers.broadcastreceivers.ejercicio.EjercicioActivity
import com.example.servicesandbroadcastreceivers.databinding.ActivityBroadcastReceiversBinding

class BroadcastReceiversActivity : AppCompatActivity() {
    lateinit var binding: ActivityBroadcastReceiversBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBroadcastReceiversBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReceiversEjemplo1.setOnClickListener {
            startActivity(Intent(this, Ejemplo1Activity::class.java))
        }
        binding.btnReceiversEjemplo2.setOnClickListener {
            startActivity(Intent(this, Ejemplo2Activity::class.java))
        }
        binding.btnReceiversEjemplo3.setOnClickListener {
            startActivity(Intent(this, Ejemplo3Activity::class.java))
        }
        binding.btnReceiversEjercicio.setOnClickListener {
            startActivity(Intent(this, EjercicioActivity::class.java))
        }
    }
}