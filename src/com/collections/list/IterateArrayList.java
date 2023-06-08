package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class IterateArrayList {
	
	//Iterate over an ArrayList using different ways
	public static void main(String[] args) {
		
		List<String> operatingSystems = new ArrayList<>();
		
		operatingSystems.add("Windows 10");
		operatingSystems.add("MacOS");
		operatingSystems.add("Fedora Linux");
		operatingSystems.add("Ubuntu");
		operatingSystems.add("CentOS");
		operatingSystems.add("OpenSUSE");
		
		System.out.println("Original ArrayList: " + operatingSystems);
		
		//Using conventional loop 
		System.out.println("\nIterating over ArrayList using for loop:");
	    for(int i = 0; i < operatingSystems.size(); i++) {
	      System.out.print(operatingSystems.get(i));
	      System.out.print(", ");
	    }
	    
	    //Using for-each-loop
	    System.out.println("\n\nIterating over ArrayList using for-each loop:");
	    for(String os : operatingSystems) {
	      System.out.print(os);
	      System.out.print(", ");
	    }
	    
	    //Using an instance of ListIterator
	    ListIterator<String> iterate = operatingSystems.listIterator();
	    System.out.println("\n\nIterating over ArrayList using an instance of ListIterator:");
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }
	    
	    //Using a Lambda expression
	    System.out.println("\n\nIterating over ArrayList using Lambda expression:");
	    operatingSystems.forEach((os) -> {
	        System.out.print(os + ", ");
	      });
	}
}