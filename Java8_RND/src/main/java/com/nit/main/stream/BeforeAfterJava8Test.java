package com.nit.main.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeforeAfterJava8Test {
	public static void main(String[] args) {
		// getting the customer data
		List<Customer> customersList = CustomerUtils.getAllCustomer();

		// display all the customer from given list before java 8
		Iterator<Customer> customerIterator = customersList.iterator();
		while (customerIterator.hasNext()) {
			// fetch customer
			Customer cust = (Customer) customerIterator.next(); // type cast to a cust type
			System.out.println("Customer :- " + cust);
		}
		System.out.println();

		// after java 8
		// convert list of customers obj into stream obj
		Stream<Customer> streamsOfCustomer = customersList.stream();
		// apply forEach() method to display record one bye one
		streamsOfCustomer.forEach(System.out::println);
		System.out.println();

		// 2nd way
		customersList.stream().forEach(System.out::println);
		System.out.println();

		System.out.println(
				"=============================FILTER OPERATIONS===============================================");
		//Wanted to print the names which length has less than 5 chars
		// create list having some names
		List<String> namesList = Arrays.asList("Shubham", "Kartik", "Shubham", "Rajesh", "Raja", "Anup", "Dipak");
		// convert list into stream obj
		Stream<String> streamsOfNames = namesList.stream();

	/*
		 * // 1st way
		 *  // filter taking predicate as args, so will write predicate first
		 * Predicate<String> lengthPredicate = str -> str.length() <= 5; 
		 * // now write filter to filter values
		 *  Stream<String> namesStream =streamsOfNames.filter(lengthPredicate);
		  // print list of record
		 * namesStream.forEach(System.out::println); System.out.println();
		 */

		// 2nd way
		streamsOfNames.filter(name -> name.length() <= 5).forEach(System.out::println);
		System.out.println();
		// getting the customer who lived in hyd
		customersList.stream().filter(cust -> "HYDERABAD".equals(cust.getLocation().toUpperCase()))
				.forEach(System.out::println);

		System.out
				.println("=============================MAP OPERATIONS===============================================");
		// wanted to get the squre of all the number and print the squre which is
		// greater than 9
		Stream<Integer> streamOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
		/*
		 * //1st way 
		 * Function<Integer,Integer> function1=no->no *no; 
		 * Predicate<Integer> predicate=no-> no>9; 
           Consumer<Integer> consumer=no->System.out.println(no);
		 * streamOfNumbers.map(function1).filter(predicate).forEach(consumer);
		 */

		// 2nd way
		streamOfNumbers.map(no -> no * no).filter(no -> no > 9).forEach(System.out::println);

		System.out.println(
				"=============================FINDANY() OPERATIONS===============================================");
		Optional<Customer> custOptional = customersList.stream()
				.filter(cust -> cust.getLocation().equalsIgnoreCase("Hyderabad")).findAny();
		// check obj is present or not
		if (custOptional.isPresent()) {
			Customer cust = custOptional.get();
			System.out.println(cust);
		}
		else {
			System.out.println("Customer not found");
		}

		System.out.println("==================================Collect Operations ============================");
		 //for list
         List<String> sortedNamesList=namesList.stream().filter(names->names.length()<=5).sorted()
        		                                        .collect(Collectors.toList());
		 sortedNamesList.forEach(System.out::println);
		 
		 System.out.println("------------------------------------");
		 
		 //for set
		 Set<String> sortedNamesSet=namesList.stream().filter(names->names.length()<=5).sorted()
				                                      .collect(Collectors.toSet());
		 sortedNamesList.forEach(System.out::println);
		 
		 System.out.println("------------------------------------");
		 
     //combine all value by camma seprated
		 String namesCammaSepratedValue=namesList.stream().filter(names->names.length()<=5).sorted()
            .collect(Collectors.joining(","));
		 
         System.out.println(namesCammaSepratedValue);
         
         System.out.println("------------------------------------");
         
         // For Map
        Map<Integer,String> namesMap=customersList.stream()
    		                                   .collect(Collectors.toMap(cust->cust.getCustId(),cust->cust.getCustName()));
	    System.out.println(namesMap);
	}
}
