package com.asgar72.rkdfsh.module2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
  private  var _binding : FragmentSignUpBinding ?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)

        return binding.root
    }
}