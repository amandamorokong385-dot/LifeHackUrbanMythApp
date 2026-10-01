package com.example.lifehackmyth

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle??) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_score)

        val score =
            intent.getIntExtra("Score", 0)
        val total =
            intent.getIntExtra("total", 0)
        val tv =
            findViewById<TextView>(R.id.tvScore)
        tv.text = "You scored $score / $total"
    }
}