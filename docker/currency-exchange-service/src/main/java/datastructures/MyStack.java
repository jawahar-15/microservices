package datastructures;

import java.util.Objects;


public class MyStack {
	Node top;
	Node bottom;
	int length;
	public MyStack() {
		this.top=null;
		this.bottom=null;
		this.length=0;
	}

	public void push(int value){
		Node newVal = new Node(value);
		if(Objects.isNull(bottom)) {
			bottom = newVal;
		}
		if(Objects.nonNull(top)) {			
			top.next = newVal;
		}			
		top=newVal;	
		length++;
	}

	public void print(){
		Node curNode = bottom;
		while(Objects.nonNull(curNode)) {
			System.out.println(curNode.value);
			curNode=curNode.next;
		}
		System.out.println("Top pointing at  " + top.value);
		System.out.println("Bottom pointing at " + bottom.value);
		System.out.println("Total Length " + length);
	}

	
	public int peek(){
		return top.value;
	}

	
	public int pop(){
		Node currPointer = bottom;
		while(Objects.nonNull(currPointer.next.next)) {
			currPointer = currPointer.next;
		}
		int deletedValue = currPointer.next.value;
		currPointer.next=null;
		length--;
		return deletedValue;

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
