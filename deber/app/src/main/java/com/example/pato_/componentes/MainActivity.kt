package com.example.pato_.componentes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        datosButton
            .setOnClickListener {
                this.irAPantallaDeDatos()
            }

    }

    fun irAPantallaDeDatos() {
        // INTENT
        val intentIrDatosActivity = Intent(this, DatosActivity::class.java)
        this.startActivity(intentIrDatosActivity )
    }
}
