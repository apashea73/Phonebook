package com.claim;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import com.claim.Address;

class TestApplication {

	public static ArrayList<Person> phoneBookEntry = new ArrayList();

	public static void main(String[] args) {		
		cases();		
	}

	public static void cases() {
		int selection = 0;
		while(selection < 7){

			System.out.println("Please enter an option: \n" + "---------------------------------\n "
					+ "1- Add New Entry\n 2- Search Contact\n 3- Delete Record\n 4- Update a Record\n 5- List all Contacts\n 6- Exit\n");
			Scanner input = new Scanner(System.in);
			selection = input.nextInt();
			switch (selection) {
			case 1: // This is for Adding New Entry
				Person person1 = new Person();

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter First Name: ");
				person1.setFirstName(sc.nextLine());

				System.out.println("Enter Middle Name: ");
				person1.setMiddleName(sc.nextLine());

				System.out.println("Enter Last Name: ");
				person1.setLastName(sc.nextLine());

				System.out.println("Enter PhoneNumber: ");
				person1.setTelephone(Long.parseLong(sc.nextLine()));			

				System.out.println("Enter Street Address: ");
				person1.setStreet(sc.nextLine());

				System.out.println("Enter City: ");
				person1.setCity(sc.nextLine());

				System.out.println("Enter State (Abbr.): ");
				person1.setState(sc.nextLine());

				System.out.println("Enter Zip Code: ");
				person1.setZip(sc.nextInt());

				phoneBookEntry.add(person1);
				System.out.println("Person Added: " + person1.getFirstName() + ", " + person1.getMiddleName() + ", "
						+ person1.getLastName() + ", " + phoneFormat(person1.getTelephone()) + ", " + person1.getStreet() + ", "
						+ person1.getCity() + ", " + person1.getState() + ", " + person1.getZip() + " \n");
				break;


			case 2: // This is for searching a Contact
				System.out.println("Search for Contact: ");

				System.out.println("Please enter an option: \n" + "---------------------------------\n "
						+ "1- Search by Last Name\n 2- Search by First Name\n 3- Search by Full Name\n 4- Search by Phone No.\n 5- Search by City or State\n 6- Exit Search");

				Scanner sc1 = new Scanner(System.in);
				int casetwoselection = input.nextInt();
				switch (casetwoselection) {

				case 1:
					System.out.println("Search by Last Name: ");
					String lastname = sc1.nextLine();
					boolean flag = true;
					for (Person person : phoneBookEntry) {
						if (person.getLastName().equals(lastname)) {
							flag = false;
							System.out.println("Person Found!!!\n");
						}
						System.out.println("Contact: " + person.getFirstName() + " " + person.getMiddleName() + " "
								+ person.getLastName());
						break;
					}
					if (flag) {
						System.out.println("Person not found.");
					}break;
				case 2:
					System.out.println("Search by First Name: ");
					String firstname = sc1.nextLine();
					boolean flag1 = true;
					for (Person person : phoneBookEntry) {
						if (person.getFirstName().equals(firstname)) {
							flag1 = false;
							System.out.println("Person Found!!!\n");
							System.out.println("Contact: " + person.getFirstName() + " " + person.getMiddleName() + " "
									+ person.getLastName());	
							break;
						}
						if (flag1) {
							System.out.println("Person not found.");
						}
					}break;
				case 3:
					System.out.println("Search by Full Name: \n");
					System.out.println("First Name: ");
					String firstname1 = sc1.nextLine();
					System.out.println("Middle Name (or leave blank): ");
					String middlename1 = sc1.nextLine();
					System.out.println("Last Name: ");
					String lastname1 = sc1.nextLine();
					boolean flag2 = true;
					for (Person person : phoneBookEntry) {
						if (person.getFirstName().equals(firstname1)) {
													
						}if(person.getMiddleName().equals(middlename1)){					
					}if(person.getLastName().equals(lastname1)){ 
						flag1 = false;
						System.out.println("Person Found!!!\n");
						break;	
					}if (flag2) {
						System.out.println("Person not found.");
					}
					}break;
				case 4:
					System.out.println("Search by Phone No. ");
					long telephone = input.nextLong();

					boolean flag3 = true;
					for (Person person : phoneBookEntry) {
						if (person.getTelephone() == telephone) {
							flag3 = false;
							System.out.println("Phone Number Found!!!\n");
						}
						System.out.println("Contact: " + person.getFirstName() + " " + person.getMiddleName() + " "
								+ person.getLastName() + ", " + phoneFormat(person.getTelephone()));
						break;
					}
					if (flag3) {
						System.out.println("Phone Number not found.");
					}break;
				case 5:
					System.out.println("Search by City or State");
					System.out.println("City: ");
					String city = sc1.nextLine();
					System.out.println("State (Abbr.): ");
					String state = sc1.nextLine();

					boolean flag4 = true;
					for (Person person : phoneBookEntry) {
						if (person.getCity().equals(city) || person.getState().equals(state)) {
							flag4 = false;
							System.out.println("Person Found!!!\n");
							System.out.println("Contact: " + person.getFirstName() + " " + person.getMiddleName() + " "
									+ person.getLastName() + " \n");
							break;					
						}
						if (flag4) {
							System.out.println("Person not found.");
						}
					}
				}break;
			case 3:
				System.out.println("Please Enter Number to Delete Contact");
				long telephone = input.nextLong();
				int i = 0;
				Boolean flag5 = true;
				for (Person person : phoneBookEntry) {
					if (person.getTelephone() == telephone) {
						flag5 = false;
						System.out.println("Phone Number Found!!!\n");						
						System.out.println("Contact Deleted: " + person.getFirstName() + " " + person.getMiddleName() + " "
								+ person.getLastName());
						phoneBookEntry.remove(i);
						break;
			}
			if (flag5) {
				System.out.println("Phone Number not found.");
			}				
			}break;
		case 4:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Phone No. to update a Record ");
			long telephone1 = input.nextLong();						
			Boolean flag6 = true;
			for (Person person : phoneBookEntry) {
				if (person.getTelephone() == telephone1) {
					flag6 = false;
					System.out.println("Phone Number Found!!!\n");
					System.out.println("Would you like to Update Contact? Y or N: " + person.getFirstName() + " "
							+ person.getMiddleName() + " " + person.getLastName() + ", " +person.getTelephone() +", " +person.getStreet() + ", "+person.getCity()+ ", " + person.getState() + ", " +person.getZip() + "\n");					
				}	
					String a= sc2.nextLine();				
					 if(a.equalsIgnoreCase("y")){
						System.out.println("Please enter New Contact Information: \n");
						System.out.println("First Name: ");
						person.setFirstName(sc2.nextLine());
						System.out.println("Middle Name: ");
						person.setMiddleName(sc2.nextLine());
						System.out.println("Last Name: ");
						person.setLastName(sc2.nextLine());
						System.out.println("Phone No. ");
						person.setTelephone(Long.parseLong(sc2.nextLine()));
						System.out.println("Street");
						person.setStreet(sc2.nextLine());
						System.out.println("City");
						person.setCity(sc2.nextLine());
						System.out.println("State");
						person.setState(sc2.nextLine());
						System.out.println("Zip");
						person.setZip(sc2.nextInt());						
					 }if(a.equalsIgnoreCase("n")){
						 break;
					 }					 
			if (flag6) {
				System.out.println("Phone Number not found.");
				break;
			}
			}break;				
		case 5:			
			System.out.println("List All Contacts");
			System.out.println("_________________\n");			
			for(Person person:phoneBookEntry) {
		        
				System.out.println(person.getFirstName() + ", "
						+ person.getMiddleName() + ", " + person.getLastName() + ", " +person.getTelephone() +", " +person.getStreet() + ", "+person.getCity()+ ", " + person.getState() + ", " +person.getZip() + "\n");;
			
			
			}break;
		case 6:
			System.out.println("You have Exited Program\n");
			break;
		}//end switch
	}//end while	
			
}//end of case method	

public static String phoneFormat(long phone) {
	DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
	String phoneRawString = phoneDecimalFmt.format(phone);

	java.text.MessageFormat phoneMsgFmt = new java.text.MessageFormat("({0})-{1}-{2}");

	String[] phoneNumArr = { phoneRawString.substring(0, 3), phoneRawString.substring(3, 6),
			phoneRawString.substring(6) };

	return phoneMsgFmt.format(phoneNumArr);
	}
}

