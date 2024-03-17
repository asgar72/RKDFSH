package com.asgar72.rkdfsh.module3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val phoneNumber = "+918109869028"
        binding.rkdfWtp.setOnClickListener {
            openSocialMedia("https://wa.me/$phoneNumber")
        }
        binding.rkdfFb.setOnClickListener {
            openSocialMedia("https://www.facebook.com/rkdfuniversitybhopal")
        }
        binding.rkdfInsta.setOnClickListener {
            openSocialMedia("https://www.instagram.com/rkdfuniversitybhopal")
        }
        binding.rkdfX.setOnClickListener {
            openSocialMedia("https://twitter.com/universityRkdf")
        }
        binding.rkdfYt.setOnClickListener {
            openSocialMedia("https://www.youtube.com/@rkdfuniversitybhopal9706")
        }

        return binding.root
    }
    private fun openSocialMedia(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}