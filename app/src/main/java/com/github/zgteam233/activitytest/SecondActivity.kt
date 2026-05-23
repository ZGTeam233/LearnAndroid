package com.github.zgteam233.activitytest

import android.os.Bundle
import com.github.zgteam233.activitytest.databinding.SecondLayoutBinding

class SecondActivity : BaseActivity() {
    private lateinit var binding: SecondLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {

        }
    }
}