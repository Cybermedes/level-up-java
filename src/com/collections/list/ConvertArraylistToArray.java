package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ConvertArraylistToArray {
	
	//Convert ArrayList to Array and vice-versa
	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();

	    // Add elements
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    System.out.println("Original ArrayList: " + languages + "\n");

	    // Create array
	    String[] languagesArray = new String[languages.size()];

	    // Convert ArrayList into the array
	    languages.toArray(languagesArray);
	    System.out.print("Array: ");
	    for(String item:languagesArray) {
	      System.out.print(item + ", ");
	    }
	    
	    // convert array languagesArray into a new list
	    List<String> programmingLanguages = new ArrayList<>(Arrays.asList(languagesArray));
	    System.out.println("\n\nNew ArrayList: " + programmingLanguages);

	}
}