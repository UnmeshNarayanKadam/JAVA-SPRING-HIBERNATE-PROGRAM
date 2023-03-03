package com.pratiti.traning.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Example3 {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		pq.add(60);
		pq.add(20);
		pq.add(30);
		pq.add(10);
		pq.add(90);
		for (Integer i : pq) {
			System.out.println(i);
		}
	    
	}

}
