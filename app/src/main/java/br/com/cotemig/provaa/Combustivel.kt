package br.com.cotemig.provaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ReportFragment.Companion.reportFragment

class Combustivel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combustivel)


        val voltar = findViewById<Button>(R.id.voltarc)
        voltar.setOnClickListener {
            finish()
        }

        val gasolina = findViewById<EditText>(R.id.gasolina)
        val etanol = findViewById<EditText>(R.id.etanol)
        val calculo = findViewById<Button>(R.id.calcularc)

        calculo.setOnClickListener {
            calcular(gasolina,etanol)
        }


    }
    fun calcular(gasolina : EditText, etanol : EditText) {
        val gas = gasolina.text.toString().toFloatOrNull()
        val et = etanol.text.toString().toFloatOrNull()
        val calculo = findViewById<TextView>(R.id.resultadoc)
        val list = ArrayList<String>()

        if (gas != null && et != null) {
            val valoret: Float = 4.04F
            val valorgas: Float= 6.07F
            val calculo = valoret / valorgas

            if (calculo <= 0.70) {
                list.add("Abasteça com Etanol$calculo".format())

            }
            else if (calculo > 0.70) {
                list.add("Abasteça com gasolina$calculo".format())
            }

        }
        val texto = list.toString()
        calculo.text = texto
    }
}