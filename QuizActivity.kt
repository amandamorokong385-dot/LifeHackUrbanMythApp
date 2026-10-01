package com.example.lifehackmyth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class QuizActivity : AppCompatActivity() {
    private val questions = listOf(
        "You can charge your phone in microwave for 10 sec?" to false,
        "Onions make you cry because of gas?" to false
    )
    private var current = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_quiz)

        val tvQ =
            findViewById<TextView>(R.id.tvQuestion)
        val btnTrue =
            findViewById<Button>(R.id.btnTrue)
        val btnFalse =
            findViewById<Button>(R.id.btnFalse)

        fun showQ() {
            if (current < questions.size) {
                tvQ.text =
                    questions[current].first
            } else {
                val i = Intent(this, ScoreActivity::class.java)
                i.putExtra("score", score)
                i.putExtra("total", questions.size)
                startActivity(i)
                finish()
            }
        }

        btnTrue.setOnClickListener {
            if (questions[current].second ==
                true
            ) score++
            showQ()
        }
        btnFalse.setOnClickListener {
            if (questions[current].second ==
                false) score++
            current++
            showQ()
        }
        showQ()
    }
}


