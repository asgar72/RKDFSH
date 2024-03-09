package com.asgar72.rkdfsh.Module1

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.asgar72.rkdfsh.Module1.ui.HomeFragment
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val window: Window = this@MainActivity.window
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.grey)
        binding.apply {
            bottomMenu.setItemSelected(R.id.home)
            bottomMenu.setOnItemSelectedListener {
                if (it == R.id.home) {
                    startActivity(Intent(this@MainActivity, HomeFragment::class.java))
                    finish()
                }
            }
        }

    }
}