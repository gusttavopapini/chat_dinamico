package com.example.chatdinamico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_button.setOnClickListener {

           var mensagemEnviada = edit_text.text.toString()

            val intent = Intent (this@MainActivity, MainActivity2::class.java)
            intent.putExtra("MENSAGEM_ENVIADA", mensagemEnviada)

            startActivity(intent)
        }
        qualTelaEstou.setOnClickListener {
            Toast.makeText(this, "tela 1", Toast.LENGTH_LONG).show()
        }

        var intent = intent
        val mensagemRecebidaDaTela2 = intent.getStringExtra("MENSAGEM_RECEBIDA_DA_TELA_2")

        val exibirMensagemRecebidaDaTela2 = findViewById<TextView>(R.id.mensagem_text)
        exibirMensagemRecebidaDaTela2.setText(mensagemRecebidaDaTela2)

        }
    }
