package com.tak4;

import java.util.Scanner;

public class Que2 {

		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter an integer number: ");
		        
		        int number = scanner.nextInt();
		      
		        
		        if (number % 2 == 0) {
		            System.out.println(number + " is an even number.");
		        } else {
		            System.out.println(number + " is not an even number.");
		        }
		    }
		}

	


