package com.asgar72.rkdfsh.module1.ui

import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
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
        webViewSetUp(binding.RkdfSite, binding.progressBar)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView, progressBar: ProgressBar) {
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                progressBar.visibility = View.GONE
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                progressBar.visibility = View.VISIBLE
            }
        }

        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                progressBar.progress = newProgress
                if (newProgress == 100) {
                    progressBar.visibility = View.GONE
                } else {
                    progressBar.visibility = View.VISIBLE
                }
            }
        }

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            settings.useWideViewPort = true //Set wide viewport for better fit
            settings.loadWithOverviewMode = true //Zoom out to fit the content to screen width
            settings.displayZoomControls = true //Display zoom controls
            loadUrl("https://www.rkdf.ac.in")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
