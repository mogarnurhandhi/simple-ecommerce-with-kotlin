package com.example.mwsp_responsi1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val getNama = intent.getStringExtra("Nama")
        val txtNama = findViewById<TextView>(R.id.nama)
        txtNama.setText(getNama)

        val getTtl = intent.getStringExtra("Ttl")
        val txtTtl = findViewById<TextView>(R.id.ttl)
        txtTtl.setText(getTtl)

        val getEmail = intent.getStringExtra("Email")
        val txtEmail = findViewById<TextView>(R.id.email)
        txtEmail.setText(getEmail)

        val jns_gender = findViewById<RadioGroup>(R.id.radioG)
        val gender = intent.getStringExtra("Gender")
        if (gender == "Laki-Laki"){
            jns_gender.check(R.id.out_laki_laki)
        }else{
            jns_gender.check(R.id.out_perempuan)
        }
    }
}