package com.nit.main.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStreamObj {
	 public static void main(String[] args) {
		 
		 
		//1st how to create empty stream obj
		 Stream  sm=Stream.empty();
		 System.out.println("Empty Stream obj :- "+sm);
		 System.out.println();
		 
		 //2nd how to create stream obj having some record
		 //List<String> names=Arrays.asList("Kartik","Shubh","Mandeep");
		 //List.of() method introduced from java 9
		 List<String> names=List.of("Kartik","Shubham","Mandeep"); 
		 Stream<String> streamOfNames=names.stream();
		 streamOfNames.forEach(System.out::println);
		 System.out.println();
		 
		 //3rd how to create arry of stream
		 String str[]=new String[]{"Kartik","SP","NP","GP"};
		 Stream<String> streamOfArrayObj=Arrays.stream(str);
		 streamOfArrayObj.forEach(System.out::println);
	}//main
}//class
