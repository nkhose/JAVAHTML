package com.nik;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TestJsoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = Jsoup.parse("<html></html>");
		doc.body().addClass("body-styles-cls");
		doc.body().appendElement("div");
		System.out.println(doc.toString());
	}

}
