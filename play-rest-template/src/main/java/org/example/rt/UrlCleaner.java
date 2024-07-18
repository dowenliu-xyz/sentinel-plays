package org.example.rt;

public class UrlCleaner {
    public static String uc(String url) {
        return url.replace("http://localhost:8011", "localHttpBin");
    }
}
