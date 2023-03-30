package com.nit.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

import com.nit.model.Customer;

public class MapVsFlatMapTest {

	public static void main(String[] args) {

		// get all customers
		List<Customer> AllCustomer = BuildDataBaseRecord.getAllRecord();

		/**----------------------------------Using MAP---------------------------------------------------------*/
		
		//List<Customer> converted List<String> ::- Data transformation
		//mapping customer->customer.getEmailId
		//One to One mapping
		List<String> emailIds = AllCustomer.stream()
				.map(cust -> cust.getEmailId())
				.collect(Collectors.toList());
		System.out.println("Using Map  emailIds :- "+emailIds);
		
		//customer->customer.getPhoneNumbers ::- One to Many Mapping
		List<List<String>> phoneNumbers= AllCustomer.stream()
				.map(cust->cust.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println("Using Map  phoneNumbers :- "+phoneNumbers); 
		
		/**----------------------------------Using FLATMAP---------------------------------------------------------*/
		
		//List<Customer> converted List<String> ::- Data transformation
		//mapping customer->customer.getPhoneNumbers (one to many mapping)
	List<String> phoneNumbersUsingFlatMap=AllCustomer.stream().flatMap(cust->cust.getPhoneNumbers().stream())
										.collect(Collectors.toList()); //here we are converting two stream into single stream and storing into list
		
		System.out.println("Using FLATMap  phoneNumbers :- "+phoneNumbersUsingFlatMap);

	}//main
}//class
