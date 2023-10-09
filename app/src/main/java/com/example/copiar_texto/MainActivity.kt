package com.example.copiar_texto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiar_texto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 /*       setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.boton)
        var cuadroTexto = findViewById<EditText>(R.id.nombre)
        var mostrarTexto = findViewById<TextView>(R.id.saludo)
        var btn_limpiar = findViewById<Button>(R.id.btn_limpiar)

        btn.setOnClickListener {
            mostrarTexto.text = "Hola, " + cuadroTexto.text.toString();
        }

        btn_limpiar.setOnClickListener {
            mostrarTexto.text = ""
            cuadroTexto.text.clear()
        }*/

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            binding.saludo.text = "Hola, "+binding.nombre.text.toString()
            Toast.makeText(this, "Prueba bocadillo", Toast.LENGTH_LONG).show()
        }

        binding.btnLimpiar.setOnClickListener {
            binding.nombre.text.clear()
            binding.saludo.text = ""
        }
    }
}