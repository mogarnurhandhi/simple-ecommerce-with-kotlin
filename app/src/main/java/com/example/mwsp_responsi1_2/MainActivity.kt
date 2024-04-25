package com.example.mwsp_responsi1_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.nama)
        val jenis_kelamin = findViewById<RadioGroup>(R.id.radioG)
        var gender: String = ""
        val ttl = findViewById<EditText>(R.id.ttl)
        val email = findViewById<EditText>(R.id.email)
        val button_daftar = findViewById<Button>(R.id.button_daftar)
        //-------------------------------------------------------------
        jenis_kelamin.setOnCheckedChangeListener { rdGroub, i ->
            val r_kelamin = findViewById<RadioButton>(i)
            if (r_kelamin.text.toString() == "Laki-Laki") {
                gender = "Laki-Laki"
            } else {
                gender = "Perempuan"
            }
        }
        //-------------------------------------------------------------
        button_daftar.setOnClickListener {
            val nama = nama.text.toString()
            val ttl = ttl.text.toString()
            val email = email.text.toString()
            //----------------------------------------------------------
            val sendData = Intent(this, Profil::class.java)
            sendData.putExtra("Nama", nama)
            sendData.putExtra("Gender", gender)
            sendData.putExtra("Ttl", ttl)
            sendData.putExtra("Email", email)
            startActivity(sendData)
        }
    }
}