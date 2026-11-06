package com.example.kval_kovtanenko_nikita

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class randomget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_randomget)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val display = findViewById<TextView>(R.id.display)
        val constrdisplay = findViewById<TextView>(R.id.constrdisplay)
        display.text =  intent.getIntExtra("desirednum",0).toString()
        constrdisplay.text =  "от 0 до ${intent.getIntExtra("constr",0).toString()}"
    }
}