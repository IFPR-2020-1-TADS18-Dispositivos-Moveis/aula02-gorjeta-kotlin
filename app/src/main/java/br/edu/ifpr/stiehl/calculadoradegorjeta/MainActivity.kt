package br.edu.ifpr.stiehl.calculadoradegorjeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalcular.setOnClickListener {
            val valor = txtValor.text.toString().toFloat()
            val percentualGorjeta = txtGorjeta.text.toString().toFloat()
            val pessoas = txtPessoas.text.toString().toInt()

            val gorjeta = valor * (percentualGorjeta / 100)
            val conta = valor + gorjeta
            val divisao = conta / pessoas

            lGorjeta.text = "Gorjeta (R$): $gorjeta"
            lTotal.text = "Total da Conta: R$ $conta"
            lDivisao.text = "Total de R$ $divisao por pessoa"
        }
    }
}
