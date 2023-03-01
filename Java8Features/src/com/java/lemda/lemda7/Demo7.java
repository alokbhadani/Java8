package com.java.lemda.lemda7;

public class Demo7 {
	int i=1111;
	public void m2() {
		Interface7 i7=new Interface7() {
			int i=2222;
			public void m1() {
				System.out.println(this.i);
			}
		};
		i7.m1();
	}
	public static void main(String[] args) {
		Demo7 d7 =new Demo7();
		d7.m2();
		

	}

}
