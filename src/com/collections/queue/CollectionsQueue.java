package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

class CollectionsQueue {

	/*
	 * The Queue interface of the Java collections framework provides
	 * the functionality of the queue data structure.
	 * It extends the Collection interface.
	 * classes that implement it:
	 * ArrayDeque
	 * LinkedList
	 * PriorityQueue
	 */
	public static void main(String[] args) {
		
		//Creating a queue from the Queue Interface
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		//Print the elements of the queue
		System.out.println(queue);
		
		//Retrieves the head of the queue
		System.out.println("The head of the queue: " + queue.peek() + "\n");
		
		//Removes the head of the queue
		String head = queue.poll();
		System.out.println("Remove the head of the queue: " + head);
		System.out.println(queue);
		
		//Returns the size of the queue
		System.out.println("Size of the queue: " + queue.size() + "\n");
		
	}
}