package sample;

import java.util.Scanner;

public class Main {
	
	
	public static final String ANSI_GREEN = "\u001B[32m";
	 public static final String ANSI_RED = "\u001B[31m";
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the ticket number:");
	        	int ticket = scanner.nextInt();
	        	
	        	if (ticket < 1000 || ticket > 9999) {
	        		System.out.println("Incorrect data entry");
	        	} else {
	        		
	        		int first = ticket / 100;
	        		int second = ticket % 100;
	        		
	        		int sumFirst = (first / 10 ) + (first % 10);
	        		int sumSecond = (second / 10) + (second % 10);
	        		
	        		if (sumFirst == sumSecond) {
	        			System.out.println(ANSI_GREEN + "Unbelievable, you have a lucky ticket");
	        		} else {
	        			System.out.println(ANSI_RED + "Bad luck, better luck next time");
	        		}
	        	}
	    
	    }
	}
