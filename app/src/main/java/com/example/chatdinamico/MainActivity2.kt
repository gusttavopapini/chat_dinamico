package com.example.chatdinamico

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //ENVIO DA MENSAGEM DA TELA 1
        send_button2.setOnClickListener {
            var mensagemEnviada = edit_text2.text.toString()
            val intent = Intent (this@MainActivity2, MainActivity::class.java)
            intent.putExtra("MENSAGEM_ENVIADA", mensagemEnviada)
            startActivity(intent)
        }

        //RECEBIMENTO DA MENSAGEM DA TELA 1
        val mensagemRecebida = intent.getStringExtra("MENSAGEM_ENVIADA")
        mensagem_text2.text = mensagemRecebida

        //QUAL TELA ESTOU?
        qualTelaEstou2.setOnClickListener {
            Toast.makeText(this, "tela 2", Toast.LENGTH_LONG).show()
        }
    }
}