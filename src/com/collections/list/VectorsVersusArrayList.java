package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class VectorsVersusArrayList {

	
	public static void main(String[] args) {

		final int size = 1_000_000;

		// Create ArrayList
		List<Integer> arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();

		// Add 1 million numbers
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}

		// How much time ArrayList will take to add 1 million numbers
		long end = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to the ArrayList: " 
		+ (end - start) + " ms");

		// Create Vector
		List<Integer> vector = new Vector<>();
		start = System.currentTimeMillis();

		// Add 1 million numbers
		for (int i = 0; i < size; i++) {
			vector.add(i);
		}

		// How much time Vector will take to add 1 million numbers
		end = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to the Vector: " 
		+ (end - start) + " ms");
	}
}