package com.example.chatdinamico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ENVIO DA MENSAGEM DA TELA 1
        send_button.setOnClickListener {
           var mensagemEnviada = edit_text.text.toString()
            val intent = Intent (this@MainActivity, MainActivity2::class.java)
            intent.putExtra("MENSAGEM_ENVIADA", mensagemEnviada)
            startActivity(intent)
        }

        //RECEBIMENTO DA MENSAGEM DA TELA 2
        val mensagemRecebida = intent.getStringExtra("MENSAGEM_ENVIADA")
        mensagem_text.text = mensagemRecebida

        //QUAL TELA ESTOU?
        qualTelaEstou.setOnClickListener {
            Toast.makeText(this, "tela 1", Toast.LENGTH_LONG).show()
        }
    }
}
