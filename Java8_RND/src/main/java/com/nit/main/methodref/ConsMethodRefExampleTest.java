package com.nit.main.methodref;

public class ConsMethodRefExampleTest {

	public ConsMethodRefExampleTest() {
		System.out.println("ConsMethodRefExampleTest.ConsMethodRefExampleTest()");
	}
	
	public static void main(String[] args) {
		IExample example =ConsMethodRefExampleTest::new;
		example.printMsg();
	}
	
}
