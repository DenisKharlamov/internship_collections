package com.deniskharlamov.internship_collections.my_collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements SimplifiedList<E> {
	
	private int size;
	private MyLinkedList.Node<E> first;
	private MyLinkedList.Node<E> last;
	
	public MyLinkedList() {
		this.size = 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyIterator();
	}

	@Override
	public boolean add(E e) {
		MyLinkedList.Node<E> nod1 = this.last;
		MyLinkedList.Node<E> nod2 = new MyLinkedList.Node<E>(nod1, null, e);
		this.last = nod2;
		if (nod1 == null) {
			this.first = nod2;
		} else {
			nod1.next = nod2;
		}
		++this.size;
		return true;
	}

	@Override
	public void add(int index, E e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(E e) {
		return this.indexOf(e) != -1;
	}

	@Override
	public E get(int index) {
		this.checkIndex(index);
		return this.getNode(index).item;
	}

	@Override
	public E remove(int index) {
		this.checkIndex(index);
		return this.deleteLink(this.getNode(index));
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public E set(int index, E e) {
		this.checkIndex(index);
		MyLinkedList.Node<E> node = this.getNode(index);
		E item = node.item;
		node.item = e;
		return item;
	}

	@Override
	public void clear() {
		MyLinkedList.Node<E> node;
		for (MyLinkedList.Node<E> node1 = this.first; node1 != null; node1 = node) {
			node = node1.next;
			node1.item = null;
			node1.next = null;
			node1.previous = null;
		}
		this.first = this.last = null;
		this.size = 0;
	}

	@Override
	public int indexOf(E e) {
		int i =0;
		MyLinkedList.Node<E> node;
		if (e == null) {
			for (node = this.first; node != null; node = node.next) {
				if (node.item == null) {
					return i;
				}
				++i;
			}
		} else {
			for (node = this.first; node != null; node = node.next) {
				if (e.equals(node.item)) {
					return i;
				}
				++i;
			}
		}
		return -1;
	}
	
	MyLinkedList.Node<E> getNode(int index) {
		MyLinkedList.Node<E> node;
		int i;
		// если в первой половине списка,
		// то проходим сначала
		if (index < this.size >> 1) {
			node = this.first;
			for (i = 0; i < index; i++) {
				node = node.next;
			}
			return node;
			// если во второй половине,
			// то проходим с конца
		} else {
			node = this.last;
			for (i = this.size - 1; i > index; i--) {
				node = node.previous;
			}
			return node.previous;
		}
	}
	
	E deleteLink(MyLinkedList.Node<E> node) {
		E item = node.item;
		MyLinkedList.Node<E> node1 = node.previous;
		MyLinkedList.Node<E> node2 = node.next;
		if (node1 == null) {
			this.first = node2;
		} else {
			node1.next = node2;
			node.previous = null;
		}
		if (node2 == null) {
			this.last = node1;
		} else {
			node2.previous = node1;
			node.next = null;
		}
		node.item = null;
		--this.size;
		return item;
	}
	
	private boolean isExistElement(int index) {
		return index >=0 && index < this.size;
	}
	
	private void checkIndex(int index) {
		if (!this.isExistElement(index)) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	// простейший итератор для прохода от начала
	// до конца
	private class MyIterator implements Iterator<E> {
		
		private MyLinkedList.Node<E> previous;
		private MyLinkedList.Node<E> next;
		private int nextIndex;
		
		public MyIterator() {
			this.next = MyLinkedList.this.first;
			this.nextIndex = 0;
		}

		@Override
		public boolean hasNext() {
			if (this.nextIndex < MyLinkedList.this.size) {
				return true;
			} else {
				this.nextIndex = 0;
				this.next = MyLinkedList.this.first;
				return false;
			}
//			return this.nextIndex < MyLinkedList.this.size;
		}

		@Override
		public E next() {
			if (!this.hasNext()) {
				throw new NoSuchElementException();
			} else {
				this.previous = this.next;
				this.next = this.next.next;
				++this.nextIndex;
				return this.previous.item;
			}
		}
	}
	
	private static class Node<E> {
		E item;
		MyLinkedList.Node<E> next;
		MyLinkedList.Node<E> previous;
		
		public Node(MyLinkedList.Node<E> nod1, MyLinkedList.Node<E> nod2, E item) {
			this.previous = nod1;
			this.next = nod2;
			this.item = item;
		}
	}
	
}



