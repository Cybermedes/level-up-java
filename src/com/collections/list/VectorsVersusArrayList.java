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
		
		//Create 2 ArrayList threads to to run at the same time
		List<Integer> multithreadedList = new ArrayList<>();
		start = System.currentTimeMillis();
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedList.add(i);
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedList.add(i);
			}
		});
		
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
		
		thread1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedVector.add(i);
			}
		});
		
		thread2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedVector.add(i);
			}
		});
		
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
}