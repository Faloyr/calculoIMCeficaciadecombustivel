package br.com.cotemig.provaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val voltar = findViewById<Button>(R.id.voltari)
        voltar.setOnClickListener {
            finish()
        }

        val peso = findViewById<EditText>(R.id.peso)
        val altura = findViewById<EditText>(R.id.altura)
        val calculo = findViewById<Button>(R.id.calculari)


        calculo.setOnClickListener {
            calcular(peso,altura)
        }
    }
    fun calcular (peso: EditText, altura: EditText) {
        val valorpeso = peso.text.toString().toFloatOrNull()
        val valoraltura = altura.text.toString().toFloatOrNull()
        var calculo = findViewById<TextView>(R.id.resultadoi)
        val list = ArrayList<String>()

        if (valoraltura !=null && valorpeso != null) {


            val calculo = valorpeso / (valoraltura * valoraltura)
            if (calculo < 18.5) {
                list.add("Abaixo do peso$calculo".format())
            }
            else if (calculo > 18.5 && calculo < 24.9) {
                list.add("peso normal$calculo".format())
            }
            else if (calculo >25 && calculo < 29.9) {
                list.add("sobrepeso$calculo".format())
            }
            else if (calculo > 30 && calculo < 39.9 ) {
                list.add("obesidade$calculo".format())
            }
            else if (calculo > 40) {
                list.add("obesidade grave$calculo".format())
            }
        }
        val texto = list.toString()
        calculo.text = texto


    }
}


