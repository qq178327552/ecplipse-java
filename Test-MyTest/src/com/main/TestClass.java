package com.main;

public class TestClass {
	public static void main(String[] args) {
		System.out.println(inc());
	}
	
	
	public static int inc(){
		int x;
		try {
			x =1/0;
			return x;
		} catch (Exception e) {
			x=2;
			System.out.println(x);
			return x;
		}finally {
			x=3;
			System.out.println(x);
		}
	}
}
