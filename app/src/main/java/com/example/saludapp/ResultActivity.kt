package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.saludapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { onBackPressed() }

        getNameAndShow()
    }

    fun getNameAndShow() {
        var bundle = intent.extras
        var name = bundle?.get("INTENT_NAME")

        binding.tvGreeting.text = "hola mundo $name"
    }


}


