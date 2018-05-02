package com.my.linked.list;

public class App {

	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.add(2);
		myList.add(5);
		System.out.println("1/ Should have 2 and 5 in myList: " + myList);
		myList.remove();
		myList.add(2018);
		System.out.println("2/ Should have 2 and 2018 in myList: " +  myList);
		myList.removeAll();
		System.out.println("3/ Should be empty: " +  myList);
		myList.add(2019);
		System.out.println("4/ Should have 2019 in myList: " + myList);
	}
}
