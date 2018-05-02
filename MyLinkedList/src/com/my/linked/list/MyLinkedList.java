package com.my.linked.list;

public class MyLinkedList {
	private Node last;
	private int size;
	
	public boolean add(int n) {
		Node newNode = new Node(n);
		newNode.prev = last;
		last = newNode;
		size++;
		return true;
	}
	
	public boolean remove() {
		if (last != null) {
			last = last.prev;
			size--;
			return true;
		}
		return false;
	}
	
	public void removeAll() {
		last = null;
		size = 0;
	}
	
	@Override
	public String toString() {
		if (last == null) {
			return "[]";
		}
		StringBuilder str = new StringBuilder("[");
		int[] elements = new int[size];
		Node search = last;
		int position = size;
		while (search != null) {
			elements[position - 1] = search.data;
			search = search.prev;
			position--;
		}
		
		for (int i = 0; i < elements.length; i++) {
			str.append(elements[i]);
			if (i < elements.length - 1) {
				str.append(", ");
			}
		}
		str.append("]");
		return str.toString();
	}
	
	private static class Node {
		
		private int data;
		private Node prev;
		
		public Node(int data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}
}
