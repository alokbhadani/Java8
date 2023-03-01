package com.java.lemda.lemda6;

public class Demo6 {
	int i = 511;
	public void m2() {
		Interface6 i6= new Interface6() {
			int i= 999;
			public void m1() {
			System.out.println(this.i);
			}
		};
		i6.m1();
	}
	public static void main(String[] args) {
		Demo6 d6 = new Demo6();
		d6.m2();

	}

}
