package com.java.lemda.lemda3;

public class Demo3 {
	public static void main(String[] args) {
		Interface3 i3 = s->s.length();
		System.out.println(i3.getLen("alok"));
	}
}
