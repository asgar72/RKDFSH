package com.asgar72.rkdfsh.module1.ui

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.asgar72.rkdfsh.databinding.FragmentSyllabusBinding


class SyllabusFragment : Fragment() {
    private var _binding: FragmentSyllabusBinding? = null
    private val binding get() = _binding!!
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSyllabusBinding.inflate(inflater, container, false)
        webViewSetUp(binding.Syllabus)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView) {
        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            settings.useWideViewPort=true
            settings.loadWithOverviewMode=true
            settings.displayZoomControls=true
            loadUrl("https://www.rkdf.ac.in/Syllabus.php")
        }
    }
}