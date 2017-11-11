package com.sumsoft.design.patterns.observer;

public class AddObserver extends Observer{

	   public AddObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Added: " +  (subject.getState() + subject.getState()));
	   }
	}