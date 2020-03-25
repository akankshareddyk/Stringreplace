package com.epam;

public class App {

	public String stringreplace(String s) {
		String op = "";
		int index1 = s.charAt(0);
		int index2 = s.charAt(1);
		if ((char) index1 == 'a' && (char) index2 == 'a') {

			op = s.replaceFirst("aa", "");

		} else if ((char) index1 == 'a') {

			op = s.replaceFirst("a", "");

		} else if ((char) index2 == 'a') {

			op = s.replaceFirst("a", "");

		} else {
			op = s;
		}
		System.out.println("input: " + s + "  output: " + op);
		return op;

	}

}
