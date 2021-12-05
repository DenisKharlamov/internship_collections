package com.deniskharlamov.internship_collections.my_collections;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		System.out.println("Create MyArrayList");

		// Создаём коллекцию на основе MyArrayList
		SimplifiedList<Integer> arr = new MyArrayList<>();

		// заполняем
		for (int i = 1; i < 26; i++) {
			arr.add(i);
		}

		// получаем итератор
		Iterator<Integer> it = arr.iterator();

		System.out.println("Output collections:");

		// перебираем
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.printf("\n\n");

		// удаляем элемент
		System.out.println("Collections remove element for index 5 --> " + arr.remove(5));

		System.out.println("Collections contains 7 ? --> " + arr.contains(7));

		System.out.println("Index of 7 --> " + arr.indexOf(7));

		System.out.println("1 change to 111");
		arr.set(0, 111);

		System.out.println("Add element 0 to index 8");
		arr.add(8, 0);

		System.out.println(arr.toString());

		System.out.println("Create MyLinkedList");
		// создаем коллекцию на основе MyLinkedList
		SimplifiedList<String> arr2 = new MyLinkedList<>();

		// заполняем
		for (int i = 1; i < 26; i++) {
			arr2.add(i + "");
		}

		// получаем итератор
		Iterator<String> it2 = arr2.iterator();

		System.out.println("Output collections:");

		// перебираем
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.printf("\n\n");

		// удаляем элемент
		System.out.println("Collections remove element for index 5 --> " + arr2.remove(5));

		System.out.println("Collections contains 7 ? --> " + arr2.contains("7"));

		System.out.println("Index of 7 --> " + arr2.indexOf("7"));

		System.out.println("1 change to 111");
		arr2.set(0, "111");

		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}

	}
}
