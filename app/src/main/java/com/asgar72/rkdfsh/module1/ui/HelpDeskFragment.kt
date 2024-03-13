package com.asgar72.rkdfsh.module1.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.FragmentHelpDeskBinding
import com.asgar72.rkdfsh.databinding.FragmentWebsiteBinding

class HelpDeskFragment : Fragment() {

    private var _binding: FragmentHelpDeskBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHelpDeskBinding.inflate(inflater, container, false)

        binding.txtEmail1.setOnClickListener {
            val email = binding.txtEmail1.text.toString().trim()
            if (email.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:$email")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                }
                startActivity(intent)
            }
        }

        binding.imgCall1.setOnClickListener {
            val phoneNumber = binding.txtNum1.text.toString().trim()
            if (phoneNumber.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$phoneNumber")
                startActivity(intent)
            }
        }
        binding.txtEmail2.setOnClickListener {
            val email = binding.txtEmail2.text.toString().trim()
            if (email.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:$email")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                }
                startActivity(intent)
            }
        }

        binding.imgCall2.setOnClickListener {
            val phoneNumber = binding.txtNum2.text.toString().trim()
            if (phoneNumber.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$phoneNumber")
                startActivity(intent)
            }
        }

        binding.txtEmail3.setOnClickListener {
            val email = binding.txtEmail3.text.toString().trim()
            if (email.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:$email")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                }
                startActivity(intent)
            }
        }
        binding.imgCall3.setOnClickListener {
            val phoneNumber = binding.txtNum3.text.toString().trim()
            if (phoneNumber.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$phoneNumber")
                startActivity(intent)
            }
        }

        binding.txtEmail4.setOnClickListener {
            val email = binding.txtEmail4.text.toString().trim()
            if (email.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:$email")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                }
                startActivity(intent)
            }
        }

        binding.imgCall4.setOnClickListener {
            val phoneNumber = binding.txtNum4.text.toString().trim()
            if (phoneNumber.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$phoneNumber")
                startActivity(intent)
            }
        }
        
        return binding.root
    }
}