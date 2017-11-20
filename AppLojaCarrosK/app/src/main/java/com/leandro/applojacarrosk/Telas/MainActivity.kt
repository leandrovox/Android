package com.leandro.applojacarrosk.Telas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.leandro.applojacarrosk.Modelos.Carro
import com.leandro.applojacarrosk.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carros:MutableList<Carro> = mutableListOf();
        carros.add(Carro("Uno", 1, 2, "branco"));
        Toast.makeText(this, carros.count(), Toast.LENGTH_LONG).show();
    }
}
