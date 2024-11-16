package br.com.cotemig.provaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    /*
 *AUTOR DO PROJETO
 *MATRICULA:72201231
 *NUMERO CHAMADA:
 * NOME: LUIS GONZAGA BARBOSA SILVA
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val combus = findViewById<Button>(R.id.combustivel)
        combus.setOnClickListener {
            telagasolina()
        }

        val aux = findViewById<Button>(R.id.imc)
        aux.setOnClickListener {
            telaimc()
        }
    }

    fun telaimc () {
        val nav = Intent (this, imc:: class.java)
        startActivity(nav)
    }
    fun telagasolina () {
        val navegacao = Intent (this, Combustivel:: class.java)
        startActivity(navegacao)
    }
}