package com.example.platzimusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*Con el metodo setContentView vamos a poder acceder a la
        clase R, es una clase que tiene a layout y luego layout tiene
        una referencia a cada uno de los archivos xml que representen
        pantallas
        */
        setContentView(R.layout.activity_profile)
        //La clase R es autogenerada


    }
}