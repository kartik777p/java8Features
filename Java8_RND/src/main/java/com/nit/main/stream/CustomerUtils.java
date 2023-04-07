package com.nit.main.stream;

import java.util.List;

public class CustomerUtils {
	
	public static List<Customer> getAllCustomer(){
		//residence addes
		Address resAddrs=new Address(001,"Old city Akola ","Akola");
		//permnent addrs
		Address permenentAddrs=new Address(002,"new city Pune ","Pune");
		
		//create list of customer having all there details
		Customer cust1=new Customer(101,"Kartik Pastapure","Hyderabad","8007275703",List.of(resAddrs,permenentAddrs));
		Customer cust2=new Customer(102,"Shubham Navghare","Pune","8007275706",List.of(resAddrs,permenentAddrs));
		Customer cust3=new Customer(103,"Akshay Ishware","Hyderabad","8007275778",List.of(resAddrs,permenentAddrs));
		Customer cust4=new Customer(104,"Pratik Patil","Akola","8009975703",List.of(resAddrs,permenentAddrs));
		Customer cust5=new Customer(105,"Rutik Bhavsar","Hyderabad","8007270003",List.of(resAddrs,permenentAddrs));
		Customer cust6=new Customer(106,"Kisna Ranmale","Mumbai","8088275703",List.of(resAddrs,permenentAddrs));
		Customer cust7=new Customer(107,"Akash Ranmale","Hyderabad","9007275703",List.of(resAddrs,permenentAddrs));
		List<Customer> list=List.of(cust1,cust2,cust3,cust4,cust5,cust6,cust7);
		return list;
	}

}
