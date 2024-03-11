package com.asgar72.rkdfsh.module1.ui

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.FragmentWebsiteBinding

class WebsiteFragment : Fragment() {

    private var _binding: FragmentWebsiteBinding? = null
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWebsiteBinding.inflate(inflater, container, false)
        webViewSetUp(binding.RkdfSite)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            settings.useWideViewPort = true //Set wide viewport for better fit
            settings.loadWithOverviewMode = true //Zoom out to fit the content to screen width
            settings.displayZoomControls = true //Display zoom controls
            loadUrl("https://www.rkdf.ac.in")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}