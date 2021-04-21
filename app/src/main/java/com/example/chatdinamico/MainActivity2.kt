package com.example.chatdinamico

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val mensagemRecebida = intent.getStringExtra("MENSAGEM_ENVIADA")
        mensagem_text2.setText(mensagemRecebida)
    }
}