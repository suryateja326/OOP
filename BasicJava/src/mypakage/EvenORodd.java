package mypakage;

import java.util.Scanner;

public class EvenORodd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		
		if(number%2==0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		scanner.close();

	}

}
