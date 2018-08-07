package com.linkedlist.gc;

import java.util.HashMap;

/**
 * @author BenjaminMcBrayer
 *
 */
public class MainApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		//Create a series of nodes and objects using head, .value, and .next.
		Node head = new Node();
		head.value = 1;
		head.next = new Node();
		(head.next).value = 2;
		head.next.next = new Node();
		(head.next.next).value = 3;
		head.next.next.next = new Node();
		(head.next.next.next).value = 4;

		// Print objects as a list in original order.
		list.printList(head);
		System.out.println();

		// Reverse the order and print.
		Node crab = list.reverseUtil(head, null);
		list.printList(crab);
		System.out.println();
		
		//Create new list using .addAtStart() method.
		LinkedList list2 = new LinkedList();
		list2.addAtStart(4);
		list2.addAtStart(3);
		list2.addAtStart(2);
		list2.addAtStart(1);
		list2.printAllNodes();
		System.out.println();

		//Print the list in reverse.
		list2.printReverse();
		System.out.println();

		// Add multiple instances of an object to list.
		list2.addAtStart(1);
		list2.addAtStart(1);
		list2.printAllNodes();
		System.out.println();
		
		// Remove all of them.
		list2.removeAll(1);
		list2.printAllNodes();
		System.out.println();
		
		// Replace one of the removed objects. 
		list2.addAtStart(1);
		list2.printAllNodes();
		System.out.println();
		
		//Remove the second object in the list (i.e., the one at index 1).
		list2.removeAt(1);
		list2.printAllNodes();
		System.out.println();
		
		//Replace the second object in the list (i.e., insert the object at index 1).
		list2.insertAt(1, 2);
		list2.printAllNodes();
		System.out.println();

		// Count the occurrences of numbers in an array.
		int[] a = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };

		FrequencyCount.countFrequencyElementsArray(a);

		// Transfer contents of the above array to a HashMap and count the occurrences
		// of each number.
		HashMap<Integer, Integer> hm = new HashMap<>();

		createHashMapFromArray(a, hm);
		
		FrequencyCount.countFrequencyElementsHashMap(hm);
		
	}

	public static void createHashMapFromArray(int[] a, HashMap<Integer, Integer> hm) {
		for (int i = 0; i < a.length; ++i) {
			hm.put(i, a[i]);
		}
	}

}
