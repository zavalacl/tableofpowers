package tableofpowers;
import java.util.Scanner;
import java.lang.Math;

public class tableofpowers {

	public static void main(String[] args) {
		// prompt user for an integer
				Scanner sc = new Scanner(System.in);

				// store input in variable
				
				String choice = "y";
				while (choice.equalsIgnoreCase("y")){
					System.out.println("Please enter an integer: ");
					int userInput = sc.nextInt();
					// if input is positive
					if (userInput >= 1) {
						// for loop up to int entered by user
						for (int i = 1; i <= userInput; i++) {
								// math to calculate square
								int square = (int) Math.pow(userInput, 2);
								// math to calculate cube
								int cubed = (int) Math.pow(userInput, 3);
								// display results
								System.out.println("The square of user input is :" + square);
								System.out.println("The cube of user input is :" + cubed);
							}
					}
					else {
						System.out.println("Please enter a positive integer: ");
						// ask to continue
						sc.nextInt();
						}

				System.out.print("Would you like to try again? ");
						choice = sc.next();
						System.out.println();
					}
					sc.close();

				
				}
		}
				


