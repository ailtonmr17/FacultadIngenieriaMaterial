package com.example.facultadingenieriamaterial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Configuración del BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_anuncios -> {
                    // Aquí puedes manejar la acción para Anuncios
                    true
                }
                R.id.navigation_becas -> {
                    // Aquí puedes manejar la acción para Becas
                    true
                }
                R.id.navigation_concursos -> {
                    // Aquí puedes manejar la acción para Concursos
                    true
                }
                R.id.navigation_capacitacion -> {
                    // Aquí puedes manejar la acción para Capacitaciones
                    true
                }
                R.id.navigation_alertas -> {
                    // Aquí puedes manejar la acción para Alertas
                    true
                }
                else -> false
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}