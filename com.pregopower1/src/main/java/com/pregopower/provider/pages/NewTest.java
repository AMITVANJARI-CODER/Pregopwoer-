package com.pregopower.provider.pages;

public class NewTest {
	
		
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count1= 0;
		
		String abc= "ami&t";
		String rev=" ";
		
		 //int upper = 0, lower = 0, number = 0, special = 0;
		 
		 
		
		 for (int i = abc.length()-1 ;  i>=0 ;i--){
			 
			 rev= rev + abc.charAt(i);
		 }
		 System.out.println("Lower case letters : " + rev); 
	        
		
	}	
		
}
