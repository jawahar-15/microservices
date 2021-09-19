package datastructures;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> first;
	Stack<Integer> second;
	boolean isPopOrPeek = false;
	QueueUsingStack(){
		first = new Stack<Integer>();
		second = new Stack<Integer>();
	}
	
	public void push(int val) {
		first.push(val);
	}
	
	public int pop() {
		isPopOrPeek = true;
		if(!second.empty()) {
			return second.pop();
		} else {			
			while(!first.empty()) {
				second.push(first.pop());
			}
			return second.pop();
		}
	}

	public int peek() {
		isPopOrPeek = true;
		if(!second.empty()) {
			return second.peek();
		} else {			
			while(!first.empty()) {
				second.push(first.pop());
			}
			return second.peek();
		}
		
	}

	public boolean empty() {
		return isPopOrPeek ? second.size() == 0 : first.size() == 0;
	}
	
	public void print() {
		
	}
}


