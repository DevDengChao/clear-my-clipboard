package dev.dengchao.clear.my.clipboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.dengchao.clear.my.clipboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}