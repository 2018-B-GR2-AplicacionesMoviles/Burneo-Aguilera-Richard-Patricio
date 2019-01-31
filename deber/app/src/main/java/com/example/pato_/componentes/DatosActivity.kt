package com.example.pato_.componentes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos.*

class DatosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        imaButExtra
            .setOnClickListener {
                this.irAPantallaExtra()
            }
    }
    fun irAPantallaExtra() {
        // INTENT
        val intentRespuesta = Intent(this, imaButExtra::class.java)
        this.startActivity(intentRespuesta)
    }
}
