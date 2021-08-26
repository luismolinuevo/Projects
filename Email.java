package EmailApplication;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private int mailboxCap = 500;
	private String alternateEmail;
	
	
	public Email(String firstName, String lastName) {  //first and last name is going to be given to me in the email objects
		this.firstName = firstName;   
		this.lastName = lastName;
		 
	}
	
	public void setDepartment() {
		System.out.print("Which DepartMent Do You Work In\n1.Sales\n2.HR\n3.Programming\nEnter Number: ");
		Scanner in = new Scanner(System.in);
		int depart = in.nextInt();  //This is a object of the scanner a line above
		
		if(depart == 1) {
			department = "Sales";
		}
		
		if(depart == 2) {
			department = "HR";
		}
		
		if(depart == 3) {
			department = "Programming";
		}
			
	}
	
	public void createPassword() {
	    byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String password = new String(array, Charset.forName("UTF-8"));

	    System.out.println(password);
	    
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

//	public void setDepartment(String department) {
//		this.department = department;
//	}

	public int getMailboxCap() {
		return mailboxCap;
	}

	public void setMailboxCap(int mailboxCap) {
		this.mailboxCap = mailboxCap;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public String toString() {
		String s;
		s = "---------------------\n"
				+ "Name: " + firstName + " " + lastName   //first and last name
				+ "\nEmail: "+firstName + "." + lastName + "@" + getDepartment() + ".codingisfun.com\nMailBox Capacity: " //email
				+ getMailboxCap() + "MD";  //mail capacity
		return s;
	}
	
	
	
	
		
		
		
	
}
