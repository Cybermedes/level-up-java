package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

class CollectionsArrayDeque {
	
	/*
	 *In order to use the functionalities of the Deque interface
	 *it's necessary to use classes that implement it:
	 *ArrayDeque
	 *LinkedList
	 */
	public static void main(String[] args) {
		
		//Create Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        //Add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers + "\n");

        //Access elements of the Deque
        System.out.println("First Element: " + numbers.peekFirst() + "\n");

        System.out.println("Last Element: " + numbers.peekLast() + "\n");

        //Remove first element
        System.out.println("Removed First Element: " + numbers.pollFirst() + "\n");
        
        //Remove last element
        System.out.println("Removed Last Element: " + numbers.pollLast() + "\n");

        System.out.println("Updated Deque: " + numbers);
	}
}
