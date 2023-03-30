package com.nit.main.methodref;

public class NonStaticRefExampleTest {
 // for user defined functional interface
	public void display() {
		System.out.println("hello guys.....!!");
	}
	
	//predefined functional interface
	public void myRun() {
		System.out.println("NonStaticRefExampleTest.myRun()");
	}
	
	public static void main(String[] args) {
		//non static method ref on userdefined method
		//create obj of the given class first
		NonStaticRefExampleTest nsmr=new NonStaticRefExampleTest();
		//Non static methof ref
		IExample example=nsmr::display;
		example.printMsg();
		System.out.println();
		
		Runnable runnable=nsmr::myRun;
		runnable.run();
		
		
	}
}
