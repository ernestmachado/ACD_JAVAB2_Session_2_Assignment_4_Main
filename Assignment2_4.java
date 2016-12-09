package ASSIGNMENTS;

import java.util.Scanner;

public class Assignment2_4 {
//Write a program to find the highest among the given 3 numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cmd = new Scanner(System.in); 
		System.out.println("Please enter three different numbers to find largest of them"); 
		int num1 = cmd.nextInt(); 
		int num2 = cmd.nextInt(); 
		int num3 = cmd.nextInt();

		  if (num1 > num2 && num1 > num3) {
	            // first number is greatest
	            System.out.println(num1 + " is greatest");
	        } else if (num2 > num1 && num2 > num3) {
	            // second number is greatest
	            System.out.println(num2 + " is greatest");
	        } else {
	            // third number is greatest
	            System.out.println(num3 + " is greatest");
	        }
	}

}
