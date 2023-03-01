package com.java.collection;

import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>((i1,i2)-> i2.compareTo(i1));
		ts.add(12);
		ts.add(56);
		ts.add(3);
		ts.add(17);
		System.out.println(ts);

	}

}
