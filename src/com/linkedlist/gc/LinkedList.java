package com.linkedlist.gc;

public class LinkedList {
	private Node head;
	private Node curr;
	public int count;

	public LinkedList() {
		head = new Node();
		curr = head;
	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next; // newNode will refer to head's next reference.
		head.next = newNode; // Now head will refer to newNode.
		++count;
	}

	public void removeFromStart() {
		if (count == 1) {
			head = null;
			curr = null;
			count = 0;
		}
		if (count > 1) {
			head = head.next;
			count--;
		} else {
			System.out.println("There are no elements in the list!");
		}
	}

	public void printAllNodes() {
		System.out.println("Head ->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("->");
		}
		System.out.println("NULL");
	}

	void printList(Node node) {
		while (node != null) {
			System.out.println(node.value + " ");
			node = node.next;
		}
	}

	public void removeAll(Object o) {
		curr = head;
		while (curr.next != null) {
			if (curr.next.value == o) {
				curr.next = curr.next.next;
				--count;
			} else {
				curr = curr.next;
			}
		}
	}

	public Node reverseUtil(Node curr, Node prev) {
		if (curr.next == null) { // Mark last node as head.
			head = curr;

			curr.next = prev; // Update next to previous node.
			return null;
		}
		Node next = curr.next; // Store curr.next node.
		curr.next = prev; // Update next again.

		reverseUtil(next, curr);
		return head;
	}
	//FIXME: Add two methods: boolean removeAt(int index) and boolean insertAt(int index, Object o).
	
}
