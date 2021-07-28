package com.github.brunoomoreshi.imc_calc_for_dio

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
