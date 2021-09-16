package homework1Task1;

import java.util.Iterator;

public class DoublyLinkedList<Item> implements Iterable<Item> {
		Node<Item> head;
		int size = 0;
		
		public void addFront(Item item) {
			Node<Item> newNode= new Node<Item>();
			newNode.data=item;
			newNode.previous=head;  ////previous, jer dodajemo na node i sada je head ono ispred tj.previous
			head=newNode;
			size++;
		}
		
		public void removeFront() {
			if(head.next ==null) {
				throw new IndexOutOfBoundsException("Empty");
			}
			head=head.next;
			head.previous=null; //jer sad nam je ona pored obrisana
			size--;
		}
		public void addRear(Item item) {
			Node<Item> newNode= new Node<Item>();
			newNode.data=item;
			if(head==null) {
				head=newNode;
			}else {
			Node<Item> current =head;
			while(current.next !=null) {
				current=current.next;
			}
			current.next=newNode;
			}
			size++;
		}
		public void removeRear(){
			if(head==null) {
				throw new IndexOutOfBoundsException("Empty");
			}
			else if(size==1) {
				head=null;
			}else{
				Node<Item> current=head;
				while(current.next.next !=null) {
					current=current.next;
				}
				current.next=null;				
			}
			size--;
		}
		
		public int count() {
			return size;
		}

		@Override
		public Iterator<Item> iterator() {
			
			return new LinkedListIterator();
		}
		
		private class LinkedListIterator implements Iterator<Item> { 		
			Node<Item> current = head;										
			
			public boolean hasNext() {										
				return current != null;										
			}																
			
			public Item next() {	
				
				Item item = current.data;									
				current = current.next;										
				return item;	
				
			}
		}
		
	}
