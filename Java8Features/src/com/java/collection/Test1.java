package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(32);
		list.add(5);
		list.add(8);	
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,(i1,i2)->i1.compareTo(i2));
		System.out.println(list);
	}

}
