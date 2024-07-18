package org.example.rt

class KtUrlCleaner {
    companion object {
        @JvmStatic
        fun uc(url: String): String {
            return url.replace("http://localhost:8011", "localHttpBin")
        }
    }
}