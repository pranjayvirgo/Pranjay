package com.pranjay;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.LinkedList.Node;

public class CustomLinkedList extends LinkedList<E>{

    @Override
    public E getFirst() {
		Node localNode = this.first;
		if (localNode == null)
			throw new NoSuchElementException();
		return localNode.item;
	}
}
