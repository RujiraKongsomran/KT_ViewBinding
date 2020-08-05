package com.rujirakongsomran.kt_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rujirakongsomran.kt_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvWord.text = "Android Spread"
    }
}