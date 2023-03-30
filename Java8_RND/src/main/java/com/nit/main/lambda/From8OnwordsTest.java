package com.nit.main.lambda;

public class From8OnwordsTest {
	
	//we will use lambda here to give impl to functional interface
	
	public static void main(String[] args) {
		System.out.println("From8OnwordsTest.main()");
		
	/*	//1) write lambda
		IFrom8Onwords fromJava8Onwords=()->{
			System.out.println("Display method called ");
		};  */
		
		//2) only one line statement is there then {,} is optional
		IFrom8Onwords fromJava8Onwords=()-> System.out.println("Display method called ");
		
		//call functional interface method
		fromJava8Onwords.display();
	}

}
