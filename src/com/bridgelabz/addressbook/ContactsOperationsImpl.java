package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsOperationsImpl implements ContactOperations  {
	public ArrayList<Contact> contact=new ArrayList<Contact>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addContact() {
		// TODO Auto-generated method stub
		    System.out.println("Contact details of Person ");	   
 	        System.out.println("Enter FirstName : ");
		    String firstname=sc.nextLine();
	        System.out.println("Enter LastName : ");          
			String lastname=sc.nextLine();
			System.out.println("Enter Address : ");
		    String address=sc.nextLine();
		    System.out.println("Enter City : ");
		    String city=sc.nextLine();
		    System.out.println("Enter State : ");
		    String state=sc.nextLine();
		    System.out.println("Enter Zip Code : ");
		    long zipcode=sc.nextLong();
		    System.out.println("Enter Mobile Number :");
		    long no=sc.nextLong();	    
		    sc.nextLine();
		    Contact details=new Contact(firstname,lastname,address,city,state,zipcode,no);
		    contact.add(details);
		
	}

}
