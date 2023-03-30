package com.nit.main.lambda;

public class AddictionTest {
	
	public static void main(String[] args) {
		//give lambda impl to functional interface
	/*	//1st way
		IAddiction addiction=(int a,int b)->{
			return a+b;
		}; */
		
	/*	//2nd way (no need of specify type here again)
		 IAddiction addiction=(a,b)->{
			return a+b;
		};  */
		
	/*	//3rd way (we can take any type of args name)
		 IAddiction addiction=(x,y)->{
			return x+y;
		};  */
		
		//4th way (if there is only one statement return type and {,} is optional)
		 IAddiction addiction=(a,b)->a+b;
		
		 
		//call method
		System.out.println("Addiction by sending values  is :- "+addiction.add(10,20));
		
		//here we are sending 10,20 as values 
		//but from java 8 we can send lambda as a method args
		
        //1st way
		//System.out.println("Addiction by sending function as args :- "+sendingFunctionAsArg(addiction));
		
        //2nd way 
		System.out.println("Addiction by sending function as args :- "+sendingFunctionAsArg((a,b)->a+b));
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Using one functional interface All Calc ");
		//here one big problem is there if we want to do calculation
		//like add,sub,div,mul then we have to write 4 functional interface
		
		//we can solve this problem using functional args type which lambda helps 
		//addiction
		ICalculations iAdd=(a,b)->a+b;
		System.out.println("Using one FunctionalInterface Add is :- "+iAdd.calc(10,20));
		//subtraction
		ICalculations iSub=(a,b)->a-b;
		System.out.println("Using one FunctionalInterface Sub is :- "+iSub.calc(10,20));
	    //Multiplication
		ICalculations iMul=(a,b)->a*b;
		System.out.println("Using one FunctionalInterface Mul is :- "+iMul.calc(10,20));
		//division
		ICalculations iDiv=(a,b)->a%b;
		System.out.println("Using one FunctionalInterface Div is :- "+iDiv.calc(10,20));
	
	}//main
	
	public static int sendingFunctionAsArg(IAddiction ia) {
		int sum=ia.add(10,20);
		return sum;
	}//sendingFunctionAsArg

}
