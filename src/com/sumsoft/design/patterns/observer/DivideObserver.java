package com.sumsoft.design.patterns.observer;

//division
public class DivideObserver extends Observer{

	   public DivideObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Divided: " + (subject.getState() / subject.getState() ) ); 
	   }
	}