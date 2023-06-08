package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ArrayListWithoutDuplicates {
	
	//Remove the duplicate elements from an ArrayList
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4, 4, 5, 6, 5, 6, 7));
		System.out.println("Original ArrayList: " + numbers + "\n");
		
		//Create a stream from the ArrayList
		Stream<Integer> numStream = numbers.stream();
		
		//Use distinct() from stream to remove duplicate
		numStream = numStream.distinct();
		
		//Convert the stream back to an ArrayList
		numbers = (ArrayList<Integer>) numStream.collect(Collectors.toList());
	    System.out.println("ArrayList without duplicate elements: " + numbers);
 	}
}