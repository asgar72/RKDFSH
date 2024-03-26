package com.asgar72.rkdfsh.module1

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.asgar72.rkdfsh.module1.ui.HomeFragment
import com.asgar72.rkdfsh.module3.AboutFragment
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.ActivityMainBinding
import com.asgar72.rkdfsh.module2.ui.LoginFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val window: Window = this@MainActivity.window
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.grey)

        replaceWithFragment(HomeFragment())
        //by default, Home fragment should be visible to the user
        // Set up click listener for the bottom menu items
        binding.bottomView.setItemSelected(R.id.home)
        binding.bottomView.setOnItemSelectedListener { itemId ->
            when (itemId) {
                R.id.home -> replaceWithFragment(HomeFragment())
                R.id.chat -> replaceWithFragment(LoginFragment()) // Replace with appropriate fragment class
                R.id.about -> replaceWithFragment(AboutFragment()) // Replace with appropriate fragment class
                else -> {
                }
            }
            true
        }
    }

    private fun replaceWithFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}