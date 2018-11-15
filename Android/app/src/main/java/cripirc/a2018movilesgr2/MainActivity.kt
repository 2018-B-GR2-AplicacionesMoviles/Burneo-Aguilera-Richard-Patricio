package cripirc.a2018movilesgr2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_navegador.setOnClickListener() {
            /*Log.i("navegacion","hola")
            Log.w("navegacion","hola")
            Log.d("navegacion","hola")
            Log.e("navegacion","hola")
            Log.v("navegacion","hola")*/
            this.irAPantallaDeBotones()
        }


        }

    fun irAPantallaDeBotones() {
        //INTENT
        val intentIrBotones = Intent(this,ButtonActivity::class.java)
        intentIrBotones.putExtra("nombre","Richard")
        intentIrBotones.putExtra("apellido","Burneo")
        this.startActivity(intentIrBotones)

    }
}
