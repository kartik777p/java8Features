package com.nit.main.lambda;

public class Upto7ApprochImpl implements IUpto7Approch {

	@Override
	public void display() {
		System.out.println("display method called ");
	}
	
	public static void main(String[] args) {
		System.out.println("Upto7ApprochImpl.main()");
		//1) create one class implementing that interface
		//2) override abstract method
		//create obj of sub class
		Upto7ApprochImpl impl=new Upto7ApprochImpl();
		//call display method
		impl.display();
		
		
	}

}
