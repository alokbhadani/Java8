package com.java.lemda.lemda5;

public class Demo5 {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0;i<10;i++) 
				System.out.println("hi");
		};
	Thread t = new Thread(r);
	t.start();
	for(int i=0;i<10;i++)
		System.out.println(i);
	}

}
