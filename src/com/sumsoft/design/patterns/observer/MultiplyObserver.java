package com.sumsoft.design.patterns.observer;

//multiplication
public class MultiplyObserver extends Observer{

	   public MultiplyObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Multiple: " + (subject.getState() * subject.getState())) ; 
	   }
	}