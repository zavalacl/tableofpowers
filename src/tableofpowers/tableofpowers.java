package tableofpowers;

import java.util.Scanner;


public class tableofpowers {

	public static void main(String[] args) {
		/*
		 * Lab 3 Task: Pair program and display a TABLE OF POWERS. Prompt the
		 * user to enter an integer. Display a TABLE of SQUARES and CUBES from 1
		 * to the value entered by user. Ask if the user wants to continue.
		 * (y/n)? Assume that the user will enter valid data. Only continue if
		 * the user agrees to.
		 * 
		 * @author DanielChristiansen
		 * 
		 * @author ClaudiaZavala
		 */

		System.out.println("Learn your squares and cubes!");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			int integer = sc.nextInt();

			if (integer >=1 ){
				String columns = "NUMBER " + "SQUARED " + "CUBED " + "\n" + "====== " + "======= " + "===== ";
				System.out.println(columns);
	
				int square = 0;
				int cube = 0;
	
				String row = "";
				for (int i = 1; i <= integer; i++) {
					square = i * i;
					cube = i * i * i;
					row = i + "       " + square + "     " + cube;
					System.out.println(row);
					System.out.println();
				}
			}
			else{
				System.out.print("Please enter a positive integer: ");
				sc.nextInt();
			}
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		}
		sc.close();
		System.out.println("Goodbye!");

		} 
}

