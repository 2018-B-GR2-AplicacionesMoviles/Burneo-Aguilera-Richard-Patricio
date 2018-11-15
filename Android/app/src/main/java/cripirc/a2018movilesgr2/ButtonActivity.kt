package cripirc.a2018movilesgr2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    var nombre:String = "";
    var apellido:String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        this.capturarDatosDelIntent()
        ButNombreApellido
            .text = "${nombre} ${apellido}"
        butEnviarIntentImplicito
            //Completar

    }

    fun capturarDatosDelIntent () {
        this.nombre = intent.getStringExtra("nombre")
        this.apellido = intent.getStringExtra("apellido")
    }

    fun enviarIntentCorreo() {
        val correo:String = txtCorreo.text
        val subject:String = txtSubject.text
        val textTo:String = txtTexto.text

        val intent = Intent(Intent.ACTION_SEND)

        intent.type = "text/html"

        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(correo,"a@a.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        intent.putExtra(Intent.EXTRA_TEXT, textTo)

        startActivity(intent)
    }
}
