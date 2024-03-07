package com.asgar72.rkdfsh.Module2

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.asgar72.rkdfsh.Module1.MainActivity
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.ActivityAboutBinding
import com.asgar72.rkdfsh.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val window: Window = this@ChatActivity.window
        window.statusBarColor = ContextCompat.getColor(this@ChatActivity, R.color.grey)
        binding.apply {
            bottomMenu.setItemSelected(R.id.chat)
            bottomMenu.setOnItemSelectedListener {
                if (it == R.id.home) {
                    startActivity(Intent(this@ChatActivity, MainActivity::class.java))
                    finish()
                }
            }
        }

    }
}