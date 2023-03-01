package com.java.collection;

import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>((i1,i2)->i2.compareTo(i1));	
		tm.put(15, "k");
		tm.put(2, "c");
		tm.put(67, "m");
		tm.put(32, "l");
		System.out.println(tm);
	}

}
