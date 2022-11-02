package kr.ssu.dongyang.minn.kotlintest_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ssu.dongyang.minn.kotlintest_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("title", "코틀린")
        intent.putExtra("year", 2022)

        binding.btnSecond.setOnClickListener {
            intent.putExtra("weight", binding.weight.text.toString())
            intent.putExtra("height", binding.height.text.toString())
            Log.v("입력1", binding.weight.text.toString())
            startActivity(intent)
        }
    }
}