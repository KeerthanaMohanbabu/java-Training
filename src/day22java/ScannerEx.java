package day22java;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name : ");
		String name = scanner.next();
		System.out.println("User name : "+name);
		System.out.println("Enter you age : ");
		int age = scanner.nextInt();
		System.out.println("User age is : "+age);
		System.out.println("Enter your height : ");
		double height = scanner.nextDouble();
		System.out.println("User height is : "+height);
		scanner.close();
	}

}