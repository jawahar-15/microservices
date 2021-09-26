package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;


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
	
	void breadthSearch() {
		Node currNode = this.head;
		Queue<Node> queue = new LinkedList<MyBST.Node>();
		List<Integer> values = new ArrayList<Integer>(); 
		queue.add(currNode);
		while(queue.size() > 0) {
			Node curr = queue.poll();
			values.add(curr.value);
			if(Objects.nonNull(curr.left)) {
				queue.add(curr.left);
			}
			if(Objects.nonNull(curr.right)) {
				queue.add(curr.right);
			}
		}
		for(int i=0;i<values.size();i++) {			
			System.out.println(values.get(i));
		}
		
	}
	
	// Inorder
	void depthSearchInorder() {
		List<Integer> values = new ArrayList<Integer>();
		traverseInOrder(this.head,values);
		System.out.print("In Order Traversal : ");
		for(int i=0;i<values.size();++i) {			
			System.out.print(" "+ values.get(i));
		}
		System.out.println();
	}
	
	private void traverseInOrder(Node root,List<Integer> list) {
		if(Objects.nonNull(root.left)) {
			traverseInOrder(root.left,list);
		}
		list.add(root.value);
		if(Objects.nonNull(root.right)) {
			traverseInOrder(root.right,list);
		}
	}

	// Preorder
	void depthSearchPreOrder() {
		List<Integer> values = new ArrayList<Integer>();
		traversePreOrder(this.head,values);
		System.out.print("Pre Order Traversal : ");
		for(int i=0;i<values.size();++i) {			
			System.out.print(" "+ values.get(i));
		}
		System.out.println();
	}
	
	private void traversePreOrder(Node root,List<Integer> list) {
		list.add(root.value);
		if(Objects.nonNull(root.left)) {
			traversePreOrder(root.left,list);
		}
		if(Objects.nonNull(root.right)) {
			traversePreOrder(root.right,list);
		}
	}

	// Postorder
	void depthSearchPostorder() {
		List<Integer> values = new ArrayList<Integer>();
		traversePostOrder(this.head,values);
		System.out.print("Post Order Traversal : ");
		for(int i=0;i<values.size();++i) {			
			System.out.print(" "+ values.get(i));
		}
		System.out.println();
	}
	
	private void traversePostOrder(Node root,List<Integer> list) {
		if(Objects.nonNull(root.left)) {
			traversePostOrder(root.left,list);
		}
		if(Objects.nonNull(root.right)) {
			traversePostOrder(root.right,list);
		}
		list.add(root.value);
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
	
	boolean checkIsValidBST(Node root) {
		if(root == null) {
			return true;
		} else {
			boolean flag = false;
			if(root.left!=null) {
				flag = root.value > root.left.value; 
			} 
			if(root.right!=null) {
				flag = root.value < root.right.value; 						
			}
			return flag && checkIsValidBST(root.left) && checkIsValidBST(root.right);
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
 