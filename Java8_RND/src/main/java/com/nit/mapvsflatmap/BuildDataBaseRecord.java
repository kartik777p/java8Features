package com.nit.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nit.model.Customer;

public class BuildDataBaseRecord {
	
	public static List<Customer> getAllRecord(){
		//creating a list of stream using Stream.of()  method
		return Stream.of(new Customer(101,"Kartik Pastapure","kartik@gmail.com", Arrays.asList("8007275703","8605121026")),
				         new Customer(102,"Mahesh Pund","mahesh@gmail.com", Arrays.asList("8877665544","1122334455")),
				         new Customer(103,"Mandeep Wadekar","mandeep@gmail.com", Arrays.asList("8087656703","9805121026")),
				         new Customer(104,"Saurabh Dharamkar","saurabh@gmail.com", Arrays.asList("8009975703","8699121026"))  
				        ).collect(Collectors.toList());
		
	}

}
