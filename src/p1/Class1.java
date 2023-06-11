package p1;

import p2.Class2;

public class Class1 extends Class2{
	String name = "Krishna";
	protected int a =10;
	
	protected Class1(String name) {
		super(name);
	}
	
	protected void m1() {
		System.out.println(name);
	}

}
