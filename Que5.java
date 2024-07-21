package com.tak4;

import java.util.Scanner;

public class Que5 {	

		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a number to check if it's prime: ");
		        
		        int number = scanner.nextInt();
		       
		        
		        if (isPrime(number)) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }

		    // Function to check if a number is prime
		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false; // 1 and numbers less than 1 are not prime numbers
		        }
		        if (num == 2 || num == 3) {
		            return true; // 2 and 3 are prime numbers
		        }
		        if (num % 2 == 0 || num % 3 == 0) {
		            return false; // numbers divisible by 2 or 3 (except 2 and 3 themselves) are not prime
		        }

		        // Check for prime numbers of the form 6k ± 1
		        for (int i = 5; i * i <= num; i += 6) {
		            if (num % i == 0 || num % (i + 2) == 0) {
		                return false;
		            }
		        }
		        
		        return true;
		    
		

	}

}
