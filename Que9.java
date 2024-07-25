package com.tak4;

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
				   	       
		        Scanner scanner = new Scanner(System.in);
		       
		        System.out.print("Please enter your age: ");
		        	       
		        int age = scanner.nextInt();
		       
		        // Check if the user is a senior citizen or not
		        if (age >= 65) {
		            System.out.println("You are a senior citizen.");
		        } else {
		            System.out.println("You are not a senior citizen.");
		        }
		    }
		

	}


