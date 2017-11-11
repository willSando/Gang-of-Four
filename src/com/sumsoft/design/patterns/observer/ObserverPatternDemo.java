package com.sumsoft.design.patterns.observer;

import java.util.Scanner;

public class ObserverPatternDemo {
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	      new AddObserver(subject);
	      new DivideObserver(subject);
	      new MultiplyObserver(subject);

	      Scanner reader = new Scanner(System.in);  
	      System.out.println("Enter a number: ");
	      int n = reader.nextInt(); // gathers input from user
	      
	      System.out.println("First number " + n);	
	      subject.setState(n);
	     // System.out.println("Second number 5");	
	     // subject.setState(5);
	   
	   
	   
	   
	   }
	}