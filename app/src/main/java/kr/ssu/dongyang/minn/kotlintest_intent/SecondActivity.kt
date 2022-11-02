package kr.ssu.dongyang.minn.kotlintest_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ssu.dongyang.minn.kotlintest_intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.text1.text = intent.getStringExtra("title")
        binding.text2.text = "${intent.getIntExtra("year", 0)}"
        var weight = intent.getStringExtra("weight")?.toDouble()
        var height = intent.getStringExtra("height")?.toDouble()
        var result = weight!! /Math.pow(height!! /100, 2.0)
        binding.textResult.text = String.format("%.2f", result)
    }
}