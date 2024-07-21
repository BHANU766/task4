package com.tak4;

import java.util.Scanner;

public class Que4 {

		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);   
		      
		        System.out.print("Enter the first number: ");
		        int firstNumber = scanner.nextInt();		        
		       
		        System.out.print("Enter the second number: ");
		        int secondNumber = scanner.nextInt();
		        		      
		        
		        // Display the original values
		        System.out.println("Original values:");
		        System.out.println("First number: " + firstNumber);
		        System.out.println("Second number: " + secondNumber);
		        
		        // Swap the numbers using an additional variable
		        int swap = firstNumber;
		        firstNumber = secondNumber;
		        secondNumber = swap;
		        
		        // Display the swapped values
		        System.out.println("Swapped values:");
		        System.out.println("First number: " + firstNumber);
		        System.out.println("Second number: " + secondNumber);
		    }
		}

	


