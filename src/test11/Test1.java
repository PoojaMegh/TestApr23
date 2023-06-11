package test11;

import p2.TestDemo;

class Test1 extends TestDemo{
	static void m2() {
		System.out.println("child m2");
	}
	
	protected static void m1() {
		System.out.println("Test m1");
	}
	
	public static void main(String[] args) {
		TestDemo a = new Test1();
		TestDemo.m1();
	}
}
