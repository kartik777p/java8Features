package com.nit.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.nit.mapvsflatmap.BuildDataBaseRecord;
import com.nit.model.Customer;

public class OptionalTest {
	
	
	private static Customer getCustomerByEmailId(String email) {
		//get all customer from DB
		List<Customer> allCustomer=BuildDataBaseRecord.getAllRecord();
		//process data
		return allCustomer.stream()
				.filter(cust->cust.getEmailId().equalsIgnoreCase(email))
				.findAny().orElse(new Customer());
	}
	
	
	public static void main(String[] args) {

		// create customer obj
		Customer customer = new Customer(101, "Shubham Navghare", "shubh@gmail.com", Arrays.asList("8007275703", "7865435678"));

		// we can create optional obj using 3ways
		// 1) using Optional.empty();

		// if you want to create an empty optional obj use this way
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		// 2) using Optional.of
		// if you want to create an optional obj having some data(must be not null) use
		// this way
		//Optional<String> usingEmailOptional1 = Optional.of(customer.getEmailId()); // if emailId
																		// is not there it will throw
																		// NullPointerException
		//System.out.println(usingEmailOptional1);

		// 3) Using ofNullable
		//if you dont know value is null or present use this way
		Optional<String> usingEmailOptional2 = Optional.ofNullable(customer.getEmailId());
		System.out.println(usingEmailOptional2); // if emailId is not null then it will give emailId otherwise give empty
												// optional obj 
		//if you want to print value which is present inside optional object
	/*	if(usingEmailOptional2.isPresent()) {
			System.out.println(usingEmailOptional2.get());
		}  */
		
		//if value is not there you want to show default value
		//System.out.println(usingEmailOptional2.orElse("default@gmail.com"));
		
		//if value is not there you want to throw exception
		//System.out.println(usingEmailOptional2.orElseThrow(()-> new IllegalArgumentException("Email Not found")));
		
		//USING MethodRef
		//take the value/string from the optional obj and make it upparcase
		System.out.println(usingEmailOptional2.map(String::toUpperCase).orElseGet(()->"default email"));
		
		//now we want to find customer based on which email i have sended if not there give empty customer obj
	   Customer cust=getCustomerByEmailId("kartik@gmail.com");
	   System.out.println("Customer details :- "+cust);
		
		
	}

}
