package com.nit.mapvsreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MapVsReduceTest {

	public static void main(String[] args) {
		
		/*------------------------------SUM ------------------------------------*/
		// Take list of int to perform any options
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);

		// 1) Traditionall way to get all of all this numbers
		int sum = 0;
		for (int no : numbers) {
			sum = sum + no;
		}
		System.out.println(" Traditionall Sum is :- " + sum);

		// 2)Using Map to Int (using lambda)
		// every time will fetch one element and add into privious one
		int sumValUsingMapToInt = numbers.stream().mapToInt(i -> i).sum();
		System.out.println("sumValUsingMapToInt :-  " + sumValUsingMapToInt);

		// 3) Using reduce with lambda
		int sumValUsingReduce = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(" sumValUsingMapToInt :- " + sumValUsingReduce);

		// 4) using method ref
		Optional<Integer> optional_Method_ref = numbers.stream().reduce(Integer::sum);
        System.out.println("optional_Method_ref :- "+optional_Method_ref.get());
	 
        System.out.println();
        /*------------------------------multiply ------------------------------------*/
       //
        int mul=1;
        for(int no:numbers) {
        	mul=mul*no;
        }
        System.out.println("mul :- "+mul);
        
      //
       int mulval= numbers.stream().reduce(1,(a,b)->a*b);
       System.out.println("Using reduce :- "+mulval);
        
       System.out.println();
       /*------------------------------Max Number ------------------------------------*/
      
       OptionalInt maxNumber=numbers.stream().mapToInt(i->i).max();
       System.out.println("Max number :- "+maxNumber.getAsInt());
       
       System.out.println();
       /*------------------------------Min Number ------------------------------------*/
      OptionalInt minNumber= numbers.stream().mapToInt(i->i).min(); 
      System.out.println("Min number :- "+minNumber.getAsInt());
	}// main

}
