package test10;

import p1.Class1;

public class Class3 extends Class1{
	
	protected Class3(String name) {
		super(name);
	}
	public static void main(String[] args) {
		Class3 cls = new Class3("harsh");
		cls.m1();
	}
}
