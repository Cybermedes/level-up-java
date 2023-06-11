package com.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

class CollectionsPriorityQueue {
	
	/*
	 * Unlike normal queues, priority queue elements
	 * are retrieved in sorted order
	 */
	public static void main(String[] args) {
		
		//Create a priority queue
		PriorityQueue<Integer> algarisms = new PriorityQueue<>();
		
		//Add elements
		algarisms.add(4);
		algarisms.add(6);
		algarisms.add(2);
		algarisms.add(5);
		algarisms.add(3);
		
		System.out.println("Original PriorityQueue: " + algarisms + "\n");

		//Use the offer() method
        algarisms.offer(1);
        System.out.println("Updated PriorityQueue: " + algarisms + "\n");
        
        //Using the peek() method
        System.out.println("Access the peek element: " + algarisms.peek() + "\n");
        
        //Using the remove() method
        boolean result = algarisms.remove(2);
        System.out.println("Is the element 2 removed? " + result + "\n");

        //Using the poll() method
        int number = algarisms.poll();
        System.out.println("Removed Element Using poll(): " + number + "\n");
        
        //Using the iterator() method
        System.out.print("PriorityQueue using iterator(): ");
        Iterator<Integer> iterate = algarisms.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }        
	}
}