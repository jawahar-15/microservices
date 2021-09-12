package datastructures;

import java.util.Objects;

public class MyLinkedList{
	
	Node head=null;
	Node tail=null;
	int length=0;
	public MyLinkedList(int value) {
		if(Objects.isNull(head)) {
			head=new Node(value);
			tail= head;
			length++;
		}
	}
	
	public void insertAt(int index,int value) {
		Node currPointer = head;
		if(index==0) {
			prepend(value);
		} else if(index >= length) {
			append(value);
		} else {			
			while((--index)>0) {
				currPointer=currPointer.next;
			}
			Node insertVal = new Node(value);
			insertVal.next = currPointer.next;
			currPointer.next= insertVal;

			length++;
		}
	}
	
	public void append(int value) {
		Node insertVal = new Node(value);
		tail.next=insertVal;
		tail=insertVal;
		length++;
	}

	public void prepend(int value) {
		Node insertVal = new Node(value);
		insertVal.next = head;
		head=insertVal;
		length++;
	}

	public void removeAt(int index) {
		Node currPointer = head;
		if(index>=length) {
			System.out.println("Not a valid index bro !");
		} else {			
			while((--index)>0) {
				currPointer=currPointer.next;
			}
			currPointer.next= currPointer.next.next;
			length--;
		}
	}

	public void print() {
		Node pointer = head;
		Node tailPointer = head;
		System.out.print("[ ");
		while(Objects.nonNull(pointer)) {
			System.out.print(pointer.value + ", ");
			pointer=pointer.next;
		}
		System.out.println(" ] ");
		while(Objects.nonNull(tailPointer.next)) {
			tailPointer = tailPointer.next;
		}
		System.out.println("Tail Pointing at [ " + tailPointer.value +  " ]");
		System.out.println("Length [" + length + "]");
	}
	
	public void reverse() {
		if(length > 1) {
			Node first = head;
			Node second = head.next;
			
			while(Objects.nonNull(second)) {
				Node tempNode = second.next;
				second.next = first;
				first = second;
				second = tempNode;
			}
			head.next=null;
			head=first;
		}
		
	}
	class Node {
		int value=0;
		Node next=null;
		public Node(int value) {
			this.value = value;
			this.next=null;
		}
	}
}