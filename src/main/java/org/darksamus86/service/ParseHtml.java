package org.darksamus86.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ParseHtml {
    public String parseHtml(String url) {
        try {
            Document doc = Jsoup.connect(url).get();

            return doc.html();
        } catch (IOException e) {
            return "Incorrect URL or input";
        }
    }
}
