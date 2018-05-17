package com.linkedlist.gc;

import java.util.Arrays;

public class List {

	private String[] items = new String[100];
	private int count = 0;

	public int length() {
		return count;
	}

	public boolean isEmpty() {
		// if (count == 0) {
		// return true;
		// } else {

		// ternary operator: shorthand code for an if-else statement.
		// condition ? true : false; can only be used in this order (of true and then false)
		return count == 0 ? true : false;
	}

	public boolean isFull() {
		return count == items.length ? true : false;
	}
	
	public boolean insert(String newItem) {
		if (count == items.length) {
			return false;
		} 
		items[count] = newItem;
		++count;
		return true;
	}

	@Override
	public String toString() {
		return "List [items=" + Arrays.toString(items) + "]";
	}
	
}
