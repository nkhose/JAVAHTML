package com.nik;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Test {
	public static void main(String[] args) throws IOException {
		File htmlTemplateFile = new File("path/templatenew.html");
		String htmlString = FileUtils.readFileToString(htmlTemplateFile);
		String title = "New Page";
		String body = "This is Body";
		htmlString = htmlString.replace("$title", title);
		htmlString = htmlString.replace("$body", body);
		System.out.println(htmlString);
		File newHtmlFile = new File("path/new.html");
		FileUtils.writeStringToFile(newHtmlFile, htmlString);
	}
}
