package com.rifqiananda.inputdatamahasiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val name = intent.getStringExtra("Name")
        val NIM = intent.getStringExtra("NIM")

        val resultName = findViewById<TextView>(R.id.tv_name)
        resultName.text = name

        val resultNIM = findViewById<TextView>(R.id.tv_NIM)
        resultNIM.text = NIM
    }
}