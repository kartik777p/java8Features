package com.nit.main.methodref;

public class StaticRefExampleTest {
	// static method ref

	// for userdefined
	public static void print() {
		System.out.println("Hello Guys how are you !!");
	}

	// for predefinied
	public static void myRun() {
		System.out.println("Run method executed !!");
	}
	
	//for add,sub,div,mul
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		System.out.println("Static method ref userdefined");
		// static method ref for userDefined functional interface
		IExample example = StaticRefExampleTest::print;
		// call method
		example.printMsg();
		System.out.println();
 
		// static method ref for predefine functional interface Runnable
		System.out.println("Static method ref predefined");
		Runnable runnable = StaticRefExampleTest::myRun;
		//call method
		runnable.run();
		System.out.println();
		/*
		//create 2nd using thread.start()
		//using method ref
		System.out.println("Using Thread(Runnable) created 2nd thread");
		Thread th=new Thread(ExampleTest::myRun); //here we are saying give this impl to runnbale class abtract method
		//start the tread
		th.start();  */
		
		System.out.println("---------------------------------------------------------------------------------");
		//add
		ICalculations add=StaticRefExampleTest::add;
		System.out.println(" Add is :- "+add.cals(10,20));
		//sub
		ICalculations sub=StaticRefExampleTest::sub;
		System.out.println(" Sub is :- "+sub.cals(10,20));
		//mul
		ICalculations mul=StaticRefExampleTest::mul;
		System.out.println(" Mul is :- "+mul.cals(10,20));
		//div
		ICalculations div=StaticRefExampleTest::div;
		System.out.println(" Div is :- "+div.cals(10,20));
		System.out.println();
	}
}
