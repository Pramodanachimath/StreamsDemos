package com.training.references;

public class StaticReferenceDemo {

	public static void main(String[] args) {

		Calculator obj=(x,y)->System.out.println((x+y));
		
	    obj.calculator(10, 20);
	System.out.println();
	
	
	   Calculator cal=Checker::printTotal;
	   cal.calculator(20, 30);
	   System.out.println();
	   
	   IGreeter greeter=(name)->System.out.println("Welcome "+name);
         
	      greeter.greetMessage("pramod");
	 	

	Checker checkobj=new Checker();
	IGreeter ref=checkobj::show;
	
	ref.greetMessage("Pramod");
}}
