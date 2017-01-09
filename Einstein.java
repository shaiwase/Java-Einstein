/**
 * This program is a "magic" game asking the user to type a positive 3 digit number with different first and last digit.
 * By making some calculation, the program will find the final number 1089.
 * Name : Karine Or
 * ID : 310261243
 * Course : Intro to computer scienses and Java PL. 20114
 * MMN 11 Question 2
 */

import java.util.Scanner;

public class Einstein {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//Introduce to the game and ask from the user to enter a valid 3 digit number.
		System.out.println ("Welcome to the Einstein magic game.");
		System.out.println ("Please enter a 3 digit positive number whose first " +
				"and last digits are different:");

		int num = scan.nextInt(); //User enter the number - save the number entered as "num" variable
		
		final int NUMORIGINAL = num; //Declare constant variable for the original number entered by the user
		final int CONSTNUMBER = 1089; //Declare constant for constant number 1089
		final int MINNUMLENGTH = 99; //Declare 2 constants for  the length of the user's number to be 3 digits only
		final int MAXNUMLENGTH = 1000;
				
		
		//if (num > 0 && LENGTH  == 3) //Check the validity of the number (positive and 3 digits only).
		if (num > 0 && num > MINNUMLENGTH  && num < MAXNUMLENGTH )// && num1 != num3)
		{
			System.out.println("The user number is: " + num);
			//below steps in order to reverse the number given by the user.
			int num3 = num % 10; //This is the third digit of the number
			num = num / 10; 
			int num2 = num % 10; //This is the second digit of the number
			int num1 = num / 10; //This is the first digit of the number

			if (num1 == num3) //Check the validity of the number (First and last digit are different).
			{
			 	System.out.println("The number is not valid. First and last digit are not different");
			}

			String reverseNum = ""+num3+num2+num1; //convert the int number to string and reverse the original number
			int reverseNumToInt =  Integer.parseInt(reverseNum); //Parse the string to int number
			int difference = Math.abs(NUMORIGINAL - reverseNumToInt); //calculate the difference between the numbers (as absolute value)
			int diffenceOrig = difference; //Keep the original difference number for future use in the program
			System.out.println("Difference: " + difference);

			//Below steps in order to reverse the difference number found in previous steps.
			int difference3 = difference % 10; //This is the third digit of the number
			difference = difference / 10; 
			int difference2 = difference % 10; //This is the second digit of the number
			int difference1 = difference / 10; //This is the first digit of the number
			String reverseDifference = ""+difference3+difference2+difference1; //convert the int number to string and reverse the original number
			int reverseDifferenceToInt =  Integer.parseInt(reverseDifference); //Parse the string to int number

			System.out.println("Reversed difference: "+ reverseDifferenceToInt);

			int sumOfDifference = diffenceOrig + reverseDifferenceToInt; //calculate the sum of difference and reverse difference 

			if (sumOfDifference == CONSTNUMBER ) //validate the sum of difference to be 1089 
				System.out.println("SUCCEEDED");
			else
				System.out.println("FAILED");

		} else {
			System.out.println("The number you entered is not a 3 digit positive number");

		}
	}
}






