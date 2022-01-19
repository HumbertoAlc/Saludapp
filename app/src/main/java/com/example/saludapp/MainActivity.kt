package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.saludapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //guardar clase para usar binding
  private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflar el activity

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShowName.setOnClickListener {
            saludar()
        }

    }

   fun saludar  (){
       if (binding.etName.text.isNotEmpty()){
        var intent= Intent(this,ResultActivity::class.java)
           intent.putExtra("INTENT_NAME",binding.etName.text)
           startActivity(intent)


       }else{
           //error
           showError() }
   }

    fun showError(){
        Toast.makeText(this,"es necesario un nombre", Toast.LENGTH_SHORT).show()
    }



}