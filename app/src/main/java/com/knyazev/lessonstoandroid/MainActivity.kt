package com.knyazev.lessonstoandroid

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.knyazev.lessonstoandroid.databinding.ActivityLearnWordBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityLearnWordBinding

    private var _binding: ActivityLearnWordBinding? = null
    private val  binding: ActivityLearnWordBinding
        get() = _binding ?: throw IllegalArgumentException("Binding for ActivityLearnWordBinding must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLearnWordBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        val tvQuestionWord: TextView = findViewById(R.id.tvQuestionWord)
//
//        tvQuestionWord.text = "42"
//        tvQuestionWord.setTextColor(Color.BLUE)
//        tvQuestionWord.setTextColor(Color.parseColor("#FDD600"))
//        tvQuestionWord.setTextColor(ContextCompat.getColor(this, R.color.bottomColor))

        with(binding) {
            binding.tvQuestionWord.text = "Android Yasa"
            binding.tvQuestionWord.setTextColor(Color.BLUE)
        }

    }
}