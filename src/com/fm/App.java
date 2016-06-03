package com.fm;

import com.jfinal.core.JFinal;

public class App {
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}
}
