package com.jesuspayan.lambdas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnOneListener oneListener =  new OnOneListener() {
			
			@Override
			public void onOne(String message) {
				// TODO Auto-generated method stub
				System.out.println("One " +  message);
			};
			
		
		};
		
		OnOneListener  oneListener2 =(String message)->{
			System.out.println("One Lambda" + message);
		};
		
		
		oneListener.onOne("Sin lambda :(");
		oneListener2.onOne("Con Lambda :)");
		OnOneListener oneListener3 = message -> System.out.println("Tu mensaje " + message);
	}
}