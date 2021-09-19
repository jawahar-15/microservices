package datastructures;

import java.util.Objects;

public class MyBST {
	
	Node head;
	public MyBST() {
		this.head = null;
	}
	
	public void insert(int value) {
		Node newVal = new Node(value);
		if(Objects.isNull(head)) {
			head = newVal;
		} else {
			Node currNode = head;
			while(true) {
				if(currNode.value > value) {
					if(Objects.nonNull(currNode.left)) {						
						currNode = currNode.left;
					} else {
						currNode.left = newVal;
						break;
					}
				} else {
					if(Objects.nonNull(currNode.right)) {						
						currNode = currNode.right;
					} else {
						currNode.right = newVal;
						break;
					}
				}
			}
		}
	}
	
	public void lookup(int val) {
		Node currPointer = head;
		while(Objects.nonNull(currPointer)) {
			if(currPointer.value == val) {
				System.out.println("Left Node : --> " + (Objects.nonNull(currPointer.left) ?  currPointer.left.value : "null" ) +
						" and Right Node : --> " +  (Objects.nonNull(currPointer.right) ?  currPointer.right.value : "null"));
				break;
			} else if(val < currPointer.value) {
				currPointer = currPointer.left;
			} else {
				currPointer = currPointer.right;
			}
		}
	}
	
	public void remove(int val) {
		Node currNode = head;
		while(true) {
			if(currNode.value == val) {
				if(Objects.isNull(currNode.left) && Objects.isNull(currNode.right)) {
					currNode = null;
					break;
				} else if(Objects.isNull(currNode.right)){
					currNode = currNode.left;
					break;
				} else {
					Node  replaceNode = currNode.right;
					currNode = Objects.isNull(replaceNode.left) ? replaceNode : replaceNode.left;
					break;
				}
			} else if(currNode.value > val) {
				currNode = currNode.left;
			} else {
				currNode = currNode.right;
			}
		}
		System.out.println("No Node found to be removed!");
	}
	
	void print(Node head) {
		System.out.println("--" + head.value);
		if(Objects.nonNull(head.left)) {
			print(head.left);
		}
		if(Objects.nonNull(head.right)) {
			print(head.right);
		}
	}
	
	class Node {
		Node left;
		Node right;
		int value;
		Node(int value) {
			this.left = null;
			this.right = null;
			this.value = value;
		}
	}
}

//        9
//    4       20
// 1    6  15   170
 