package com.deniskharlamov.internship_collections.my_collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements SimplifiedList<E> {

	private static final int DEFAULT_CAPACITY = 10;
	private E[] arr;
	private int size;

	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.arr = (E[]) new Object[DEFAULT_CAPACITY];
		this.size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public MyArrayList(int capacity) {
		if (capacity > 0) {
			this.arr = (E[]) new Object[capacity];
		} else {
			this.arr = (E[]) new Object[DEFAULT_CAPACITY];
		}
	}

	@Override
	public Iterator<E> iterator() {
//		return new MyArrayList.MyIterator();
		return new MyIterator();
	}

	@Override
	public boolean add(E e) {
		this.validationExpansion(size + 1);
		this.arr[this.size++] = e;
		return true;
	}
	
	@Override
	public void add(int index, E element) {
		if (index > this.size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		this.validationExpansion(index + 1);
		System.arraycopy(this.arr, index, this.arr, index + 1, this.size - index);
		this.arr[index] = element;
		++this.size;
	}

	private void validationExpansion(int size) {
		if (size - this.arr.length >0) {
			expansion();
		}
		
	}

	private void expansion() {
		int length = this.arr.length;
		int newLength = length * 3 / 2;
		this.arr = Arrays.copyOf(this.arr, newLength);
	}

	@Override
	public E get(int index) {
		this.rangeCheck(index);
		return arr[index];
	}
	
	@Override
	public E set(int index, E element) {
		this.rangeCheck(index);
		E val = this.arr[index];
		this.arr[index] = element;
		return val;
	}

	@Override
	public E remove(int index) {
		this.rangeCheck(index);
		E element = this.arr[index];
		int n = this.size - index - 1;
		if (n > 0) {
			System.arraycopy(this.arr, index + 1, this.arr, index, n);
		}
		this.arr[--this.size] = null;
		return element;
	}

	@Override
	public int size() {

		return size;
	}
	
	public void trimToSize() {
		if (this.size < this.arr.length) {
			if (size != 0) {
				this.arr = Arrays.copyOf(this.arr, this.size);
			}
		}
	}
	
	@Override
	public void clear() {
		for (int i = 0; i < this.size; i++) {
			this.arr[i] = null;
		}
		this.size = 0;
	}
	
	private void rangeCheck (int index) {
		if (index >= this.size) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	@Override
	public boolean contains(E e) {
		return this.indexOf(e) >= 0;
	}
	
	public int indexOf(E e) {
		int i;
		if (e == null) {
			for (i = 0;  i< this.size; i++) {
				if (this.arr[i] == null) {
					return i;
				}
			}
		} else {
			for (i = 0; i < this.size; i++) {
				if (e.equals(this.arr[i])) {
					return i;
				}
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		this.trimToSize();
		return Arrays.toString(arr);
	}
	
	private class MyIterator implements Iterator<E> {
		private int index;
		private final E[] val;

		private MyIterator() {
			index = 0;
			this.val = MyArrayList.this.arr;
		}

		@Override
		public boolean hasNext() {

			return this.index != MyArrayList.this.size;
		}

		@Override
		public E next() {

			if (this.index >= MyArrayList.this.size) {
				throw new NoSuchElementException();
			} else {
				return val[index++];
			}

		}

		@Override
		public void remove() {

			throw new UnsupportedOperationException();
		}
	}

}


