package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class VectorsVersusArrayList {
	
	/*
	 * Vectors compared to the ArrayList Vectors appeared on the first Java Version,
	 * even before ArrayLists In Java 1.2, Vector was retro fitted to implement the
	 * List interface Both ArrayList and Vector have the same methods Main
	 * difference between the 2 is performance
	 */
	public static void main(String[] args) throws InterruptedException {

		// Create ArrayList
		List<Integer> arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();

		addOneMillionElements(arrayList);

		// How much time ArrayList will take to add 1 million numbers
		long end = System.currentTimeMillis();
		System.out.println("Time to add 1,000,000 elements to the ArrayList: " 
		+ (end - start) + " ms");

		// Create Vector
		List<Integer> vector = new Vector<>();
		start = System.currentTimeMillis();

		addOneMillionElements(vector);

		// How much time Vector will take to add 1 million numbers
		end = System.currentTimeMillis();
		System.out.println("Time to add 1,000,000 elements to the Vector: " 
		+ (end - start) + " ms");
		
		//Create 2 ArrayList threads to to run at the same time
		List<Integer> multithreadedList = new ArrayList<>();
		start = System.currentTimeMillis();
		
		Thread thread1 = new Thread(() -> addOneMillionElements(multithreadedList));
		
		Thread thread2 = new Thread(() -> addOneMillionElements(multithreadedList));
		
		//Threads to run at the same time
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		//Final results
		end = System.currentTimeMillis();
		System.out.println("\nAdded elements using multithreading to the ArrayList: " 
		+ (end - start) + " ms");
		System.out.println("Elements added: " + multithreadedList.size());
		
		//Create 2 Vector threads to to run at the same time
		List<Integer> multithreadedVector = new Vector<>();
		start = System.currentTimeMillis();
		
		thread1 = new Thread(() -> addOneMillionElements(multithreadedVector));
		
		thread2 = new Thread(() -> addOneMillionElements(multithreadedVector));
		
		//Threads to run at the same time
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		//Final results
		end = System.currentTimeMillis();
		System.out.println("Added elements using multithreading to the Vector: " 
		+ (end - start) + " ms");
		System.out.println("Elements added: " + multithreadedVector.size());
	}
	
	static void addOneMillionElements(List<Integer> arr) {
		final int size = 1_000_000;
		for (int i = 0; i < size; i++) {
			arr.add(i);
		}
	}
}