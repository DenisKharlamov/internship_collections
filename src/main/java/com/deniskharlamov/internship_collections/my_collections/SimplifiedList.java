package com.deniskharlamov.internship_collections.my_collections;

/*
 * Упрощенный интерфейс лист
 */
public interface SimplifiedList<E> extends Iterable<E>{
	
	boolean add(E e);
	void add(int index, E e);
	boolean contains(E e);
	E get(int index);
	E remove(int index);
	int size();
	E set(int index, E e);
	void clear();
    int indexOf(E e);
}
