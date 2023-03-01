package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEno(11);
		emp.setEname("Sumit");
		emp.setEsal(12000);
		
		Employee emp2 = new Employee();
		emp2.setEno(9);
		emp2.setEname("Ravi");
		emp2.setEsal(17000);
		
		Employee emp3 = new Employee();
		emp3.setEno(17);
		emp3.setEname("Amrit");
		emp3.setEsal(11000);
		
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		
		List<String> names =list.stream().filter(e->e.getEsal()>12000).map(e->e.getEname()).collect(Collectors.toList());
		System.out.println(names);
		
		Collections.sort(list,(e1,e2)->e2.getEsal().compareTo(e1.getEsal()));
		System.out.println(list);
	}

}
