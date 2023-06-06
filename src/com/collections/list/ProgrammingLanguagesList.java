package com.collections.list;

import java.util.ArrayList;
import java.util.List;

class ProgrammingLanguagesList {

	public static void main(String[] args) {
		//Create the ArrayList
		List<String> languages = new ArrayList<>();
		
		//Add programming languages to the List
		languages.add("Java");
		languages.add("C");
		languages.add("HTML");
		languages.add("Python");
		languages.add("Kotlin");
		System.out.println(">>>Programming languages: " + languages + "\n");
		
		//Get the element from the Arraylist
		String lang = languages.get(2);
		System.out.println(">>>Element at index 2: " + lang + "\n");
		
	    //Change the element of the array list
	    languages.set(2, "Rust");
	    System.out.println(">>>Change the element at index 2: " + languages + "\n");
	    
	    //Remove element from index 2
	    String str = languages.remove(1);
	    System.out.println(">>>Removed Element: " + str);
	    System.out.println(">>>Updated ArrayList: " + languages + "\n");
	    
	    //Iterate using for-each loop
	    System.out.println(">>>Accessing the elements in the ArrayList:");
	    
	    for (String language : languages) {
	      System.out.print(language + ", ");
	    }
	    System.out.println("");
		
	}
}