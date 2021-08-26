package EmailApplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome.This program will create your company email");
		
		System.out.println("What is your first name: ");
		String firstName = sc.nextLine();
		
		System.out.println("What is your last name: ");
		String lastName = sc.nextLine();
		
		
		
		Email bob = new Email(firstName, lastName);
		bob.setDepartment();
		System.out.println(bob.toString());

	}

}
