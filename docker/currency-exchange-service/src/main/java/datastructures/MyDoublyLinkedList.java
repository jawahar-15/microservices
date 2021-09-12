package datastructures;

import java.util.Objects;

import datastructures.MyLinkedList.Node;

public class MyDoublyLinkedList{

	DoublyNode head=null;
	DoublyNode tail = null;
	int length=0;
	
	public MyDoublyLinkedList(int value) {
		DoublyNode newNode= new DoublyNode(value);
		head = newNode;
		tail = null;
		length++;
	}

	public void insertAt(int index,int value) {
		DoublyNode currPointer = head;
		DoublyNode insertVal= new DoublyNode(value);
		if(index==0) {
			prepend(value);
		} else if (index>=length) {
			append(value);
		} else {			
			while( (--index) > 0){
				currPointer = currPointer.next;
			}
			DoublyNode nextPointer = currPointer.next;
			insertVal.next = nextPointer;
			insertVal.prev=currPointer;
			currPointer.next=insertVal;
			nextPointer.prev=insertVal;
			length++;
		}
	}

	public void removeAt(int index) {
		DoublyNode currPointer = head;
		if(index>=length) {
			System.out.println("Not a valid index bro !");
		} else if(index == length-1){
			while( (--index) > 0){
				currPointer = currPointer.next;
			}
			currPointer.next=null;
		}
		else {			
			while( (--index) > 0){
				currPointer = currPointer.next;
			}
			currPointer.next = currPointer.next.next;
			currPointer.next.prev=currPointer;
			length++;
		}
	}
	public void prepend(int value) {
		DoublyNode insertVal= new DoublyNode(value);
		insertVal.next= head;
		head.prev=insertVal;
		head=insertVal;
		length++;
	}

	public void append(int value) {
		DoublyNode currPointer= head;
		while(Objects.nonNull(currPointer.next)) {
			currPointer=currPointer.next;
		}
		DoublyNode insertVal= new DoublyNode(value);
		currPointer.next=insertVal;
		insertVal.prev=currPointer;
		length++;
	}

	public void reverse() {
		DoublyNode first = head;
		DoublyNode second = head.next;
		if(length > 1) {
			while(Objects.nonNull(second)) {
				DoublyNode temp=second.next;
				second.next=first;
				first.prev=second;
				first=second;
				second=temp;
			}
			this.head.next=null;
			first.prev=null;
			this.head=first;
				
		}
	}
	
	public void print() {
		DoublyNode pointer = head;
		DoublyNode tailPointer = head;
		System.out.print("[ ");
		while(Objects.nonNull(pointer)) {
			System.out.print(pointer.value + "( Prev: " + (Objects.nonNull(pointer.prev) ? pointer.prev.value : "null")+ " )"+ ", " );
			pointer=pointer.next;
		}
		System.out.println(" ] ");
		while(Objects.nonNull(tailPointer.next)) {
			tailPointer = tailPointer.next;
		}
		System.out.println("Tail Pointing at [ " + tailPointer.value +  " ]");
		System.out.println("Length [" + length + "]");
	}

	class DoublyNode{
		DoublyNode prev = null;
		DoublyNode next = null;
		int value= 0;
		public DoublyNode(int value) {
			this.prev=null;
			this.value=value;
			this.next=null;
		}
	}
}
