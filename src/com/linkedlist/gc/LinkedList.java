package com.linkedlist.gc;

public class LinkedList {
	private Node head;
	private Node curr;
	public int count;

	public LinkedList() {
		head = new Node();
		curr = head;
	}

	public void addAtStart(Object o) {
		Node newNode = new Node();
		newNode.value = o;
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
			--count;
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

	public void printReverse() {
		curr = head;
		while (count > 0) {
			for (int i = 0; i < count; ++i) {
				curr = curr.next;
			}
			System.out.println(curr.value);
			--count;
			curr = head;
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

		reverseUtil(next, curr); // Recursion.
		return head;
	}

	public void removeAt(int index) {
		if (index == 0) {
			// Remove the first element.
			head = head.next;
		} else {
			// Remove any element other than the first.
			// Traverse to node immediately before the one to be removed.
			Node curr = head;
			for (int i = 0; i < index; ++i) {
				curr = curr.next;
			}
			// Make its next pointer skip over the node to be removed.
			curr.next = curr.next.next;
		}
	}
	
	public boolean removeAtIndex(int index) {
		Node current = head;
		Node removeNode = new Node();
		
		for (int i = count - 1; i >= 0; i--) {

			if (i == index) {
				removeNode = current.next;
				current.next = removeNode.next;
				count--;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void insertAt(int index, Object o) {
		if (index == 0) {
			addAtStart(o);
		} else {
			Node newNode = new Node();
			newNode.value = o;
			Node curr = head;

			for (int i = 0; i < index; ++i) {
				curr = curr.next;
			}

			newNode.next = curr.next;
			curr.next = newNode;
		}
	}

}
