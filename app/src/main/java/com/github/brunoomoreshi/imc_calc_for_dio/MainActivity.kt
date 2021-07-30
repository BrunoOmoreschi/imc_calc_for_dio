package com.github.brunoomoreshi.imc_calc_for_dio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import java.lang.Integer.parseInt
import java.lang.NullPointerException
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        metodoPrincipal()

        //Ainda sem uso, mas vamos colocar numa outra activity com um infográfico de IMC
        var tvResult = findViewById<TextView>(R.id.tvResultado)
    }


    fun metodoPrincipal() {
        val calcBTN = findViewById<Button>(R.id.btCalc)

        //Função de comportamento do botão
        calcBTN.setOnClickListener {
            calcIMC()
        }
    }


    fun calcIMC() {
        var etPeso : Float? = (findViewById<EditText>(R.id.etPeso).text).toString().toFloat()
        val etAltura : Float? = (findViewById<EditText>(R.id.etAltura).text).toString().toFloat()
        var tvIMC = findViewById<TextView>(R.id.tvAppNameDisp)
        if (etAltura != null && etPeso != null){
            var imcCalculado = etPeso / (etAltura * etAltura)
            var convt = imcCalculado.toString()
            tvIMC.text = "Seu IMC é ${convt}"
            //Todo está resultando em um numero com muitas casas decimais
        }
        else{Log.d("Debug", "Valor do IMC não disponivel")}
        //Todo Tratar a java.lang.NumberFormatException: Invalid float: "" quando não há valor digitado e é clicado em calcular

    }

    //Funções de  estudo do ciclo de vida das activities
    //Não são necessárias para o projeto e podem ser comentadas
    /*

    override fun onStart() {
        super.onStart()
        Log.w("Lifecyle", "Entrei no Start, tela visivel.")
    }

    override fun onResume() {
        super.onResume()
        Log.w ("Lifecyle", "Entrei no Resume, tela disponivel para interação.")
    }

    override fun onPause() {
        super.onPause()
        Log.w ("Lifecyle","Pause = a tela perdeu o foco do usuario.")
    }

    override fun onStop() {
        super.onStop()
        Log.w ("Lifecyle", "Stop = tela minimizada, ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecyle", "Restart = voltando para a tela.")
    }

    override fun onDestroy() {
        Log.w ("Lifecyle", "Destroy = actvity eliminada")
        super.onDestroy()
    }*/


}