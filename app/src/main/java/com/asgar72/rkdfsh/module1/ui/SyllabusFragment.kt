import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.asgar72.rkdfsh.databinding.FragmentSyllabusBinding

class SyllabusFragment : Fragment() {
    private var _binding: FragmentSyllabusBinding? = null
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSyllabusBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webViewSetUp(binding.Syllabus, binding.progressBar)
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
            settings.useWideViewPort = true
            settings.loadWithOverviewMode = true
            settings.displayZoomControls = true
            loadUrl("https://www.rkdf.ac.in/Syllabus.php")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
