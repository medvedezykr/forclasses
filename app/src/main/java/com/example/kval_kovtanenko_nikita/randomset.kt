package com.example.kval_kovtanenko_nikita

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class randomset : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_randomset)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val incbutt = findViewById<Button>(R.id.randincbutt)
        val decbutt = findViewById<Button>(R.id.randdecbutt)
        val getbutt = findViewById<Button>(R.id.randgetnum)
var numinquestion = findViewById<TextView>(R.id.constrview)

        incbutt.setOnClickListener {
var currnum = numinquestion.text.toString().toInt()
           var incednum = currnum+1
            numinquestion.text = incednum.toString()
        }
decbutt.setOnClickListener {
    var currnum = numinquestion.text.toString().toInt()
    var incednum = currnum-1
    numinquestion.text = incednum.toString()
}
        getbutt.setOnClickListener {
            val desirednum = (0..numinquestion.text.toString().toInt()).random()
            val intent = Intent(this, randomget::class.java)
intent.putExtra("desirednum", desirednum)
            intent.putExtra("constr", numinquestion.text.toString().toInt())
            startActivity(intent)

        }
    }
}