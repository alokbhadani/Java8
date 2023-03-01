package com.java8.defint;

public class DefaultMethod implements A,B{

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.m1();

	}
	public void m1() {
		B.super.m1();
		}
}
