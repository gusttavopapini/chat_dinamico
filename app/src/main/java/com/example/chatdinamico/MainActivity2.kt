package com.example.chatdinamico

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val mensagemRecebida = intent.getStringExtra("MENSAGEM_RECEBIDA")

        val exibirMensagemRecebida = findViewById<TextView>(R.id.mensagem_text2)
        exibirMensagemRecebida.setText(mensagemRecebida)

        qualTelaEstou2.setOnClickListener {
            Toast.makeText(this, "tela 2", Toast.LENGTH_LONG).show()
    }
        send_button2.setOnClickListener {

            var mensagemRespondida = edit_text2.text.toString()

            val intent2 = Intent (this@MainActivity2, MainActivity::class.java)
            intent2.putExtra("EXTRA_MENSAGEM_ENVIADA", mensagemRespondida)

            startActivity(intent)
        }
}
}