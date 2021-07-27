package com.rifqiananda.inputdatamahasiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btnInput : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_login)

        val etName = findViewById<EditText>(R.id.et_name)
        val etNIM = findViewById<EditText>(R.id.et_NIM)

        btnInput = findViewById(R.id.btn_input)

        btnInput.setOnClickListener {

            val name = etName.text.toString()
            val NIM = etNIM.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("NIM", NIM)
            startActivity(intent)
        }
    }
}