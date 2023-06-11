package test10;

import a.Q1_Parent;

public class Q1_Child extends Q1_Parent{
	int cnt = 0;
	
	public Q1_Child() {
		cnt++;
	}
	
	public void m1() {
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		Q1_Parent p = new Q1_Child();
		p.m1();
	}
}
