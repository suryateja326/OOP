package mypakage;

import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args)  {
			System.out.print("Enter a day b/n (1to7) : ");
			Scanner inp=new Scanner(System.in);
			int day=inp.nextInt();
			switch(day) {
			case 1:
	System.out.println("Its Monday");
				break;
			case 2:
				System.out.println("Its Tuesday");
				break;
			case 3:
				System.out.println("Its Wednesday");
				break;
			case 4:
				System.out.println("Its Thursday");
				break;
			case 5:
				System.out.println("Its Friday");
				break;
			case 6:
				System.out.println("Its Saturday");
				break;
			case 7:
				System.out.println("Its Sunday");
				break;
			
			}
			inp.close();

		}

	}