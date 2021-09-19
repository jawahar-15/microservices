package datastructures;

import java.util.Objects;

import datastructures.MyStack.Node;

public class MyQueue {
	Node first;
	Node last ;
	int length=0;
	
	public MyQueue() {
		first = null;
		last = null;
		length = 0;
	}
	
	public void enqueue(int value) {
		Node newVal = new Node(value);
		if(Objects.nonNull(first)) {
			last.next = newVal;
			last = newVal;
		} else {			
			first = newVal;
			last = newVal;
		}
		length++;
	}
	
	public void dequeue() {
		if(Objects.nonNull(first)) {
			first = first.next;
			length--;
		}
	}

	public int peek() {
		return first.value;
	}
	
	public boolean isEmpty() {
		return Objects.isNull(first);
	}
	
	public void print(){
		Node curNode = first;
		while(Objects.nonNull(curNode)) {
			System.out.println(curNode.value);
			curNode=curNode.next;
		}
		System.out.println("Top pointing at  " + first.value);
		System.out.println("Bottom pointing at " + last.value);
		System.out.println("Total Length " + length);
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
