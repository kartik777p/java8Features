package com.nit.main.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		//get the all customers object from customer
		List<Customer> customerList=CustomerUtils.getAllCustomer();
		
		//convert collection object into stream obj
		Stream<Customer> customerStream=customerList.stream();
		
		//wanted to display customer info obj by obj
		//forEach() is a terminal oprations
		//Consumer is an functional interface which is taking customer obj and displaying customer obj
		//passing consumer obj to forEach() method will exicute every customer obj of that list
		System.out.println(" USE OF CUNSUMER PREDIFINED FUNCTIONAL INTERFACE :- ");
		//1st way (using 2 lines)
		Consumer<Customer> consumerCustomer=cust->System.out.print(cust);
		//call fucntional interface
		customerList.forEach(consumerCustomer);  //here we created lambda first then passing it as args
		
		//2nd way (using 1 line)
		//customerList.forEach(System.out::println);
		customerList.forEach(cust->System.out.println(cust));  //directly passing lambda
		System.out.println();
		
		//wanted to names of the all customer using stream
		
	/*	//1st way suing 3 lines(functional interface)
	     System.out.println(" USE OF CUNSUMER FUNCTION FUNCTIONAL INTERFACE :- ");
		Function<Customer,String> customerFunction=cust->cust.getCustName();
		Stream<String> streamNames1=customerStream.map(customerFunction);
		streamNames1.forEach(custName->System.out.println(custName));
		System.out.println();  */
		
	/*	//2nd way using 2 lines of code
	    System.out.println(" USE OF CUNSUMER FUNCTION FUNCTIONAL INTERFACE :- ");
		//perform intermediate operations
		Stream<String> streamOfNames=customerStream.map(cust->cust.getCustName());
		//print customer names using terminal operation like forEach
		streamOfNames.forEach(System.out::println);  */
		System.out.println();
		
		//wanted to fetch the customer details whoes location is hyd
		System.out.println(" USE OF CUNSUMER PREDICATE FUNCTIONAL INTERFACE :- ");
		//1st ways using 3 lines 
		Predicate<Customer> predicateCustomer=cust->cust.getLocation().equalsIgnoreCase("Hyderabad");
		Stream<Customer> streamOfLocationBasedCustomer=customerStream.filter(predicateCustomer);
		streamOfLocationBasedCustomer.forEach(System.out::println);
		
	}

}
