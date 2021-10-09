package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DataStructuresServiceApplication {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
//		System.out.println(findIfItHasPair(nums, 12));
//		System.out.println(reverse("yob doog a si rahawaJ"));
//		int[] arr1 = {0,1,2,3,4,200};
//		int[] arr2 = {0,1,2,3,4,5,10};
//		int[] result= mergeSortedArrays(arr1,arr2);
//		for(int i=0 ;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
//		int target = 26;
//		int[] result = twoSum(numbers,target);
//		for(int i=0 ;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
//		int[] numbers = {1,2,3,4,5,6,7};
//		System.out.println(maxSubArray(numbers));

//		int[] result = moveZeroes(numbers);
//		int[] result = rotateEff(numbers,3);
//		for(int i=0 ;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
//		MyLinkedList myLl = new MyLinkedList(10);
//		myLl.append(15);
//		myLl.prepend(40);
//		myLl.append(20);
//		myLl.prepend(30);
////		myLl.insertAt(1,99);
//		myLl.insertAt(0,100);
//		myLl.insertAt(0,190);
//		myLl.insertAt(1,1995);
//		myLl.insertAt(5,2000);
//		myLl.removeAt(5);
//		myLl.removeAt(60);
//		myLl.print();
		

//		MyLinkedList myll = new MyLinkedList(1);
//		myll.append(2);
//		myll.append(3);
//		myll.prepend(0);
//		myll.prepend(-1);
//		myll.insertAt(5, 4);
//		myll.reverse();
//		myll.print();
		
//		MyDoublyLinkedList mydll = new MyDoublyLinkedList(1);
//		mydll.append(2);
//		mydll.append(3);
//		mydll.prepend(0);
//		mydll.prepend(-1);
//		mydll.insertAt(5, 4);
//		mydll.reverse();
//		mydll.print();
		
		// STACKS
//		MyStack stk = new MyStack();
//		stk.push(10);
//		stk.push(25);
//		stk.push(30);
//		stk.push(45);
//		stk.push(55);
//		stk.push(60);
//		stk.push(75);
//		System.out.println(stk.peek());
//		stk.print();
//		System.out.println("Deleted value is :"  +  stk.pop());
//		stk.pop();
//		stk.print();

		// Queue
//		MyQueue queue = new MyQueue();
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.enqueue(40);
//		queue.enqueue(50);
//		System.out.println("Peeek :" + queue.peek());
//		queue.dequeue();
//		System.out.println("Peeek :" + queue.peek());
//		queue.dequeue();
//		System.out.println("Peeek :" + queue.peek());
//		queue.print();

//		QueueUsingStack qs = new QueueUsingStack();
//		qs.push(10);
//		qs.push(20);
//		qs.push(30);
		
//		MyBST bst = new MyBST();
//		bst.insert(9);
//		bst.insert(4);
//		bst.insert(20);
////		bst.insert(1);
//		bst.insert(6);
//		bst.insert(15);
//		bst.insert(170);
//		bst.print(bst.head);
//		System.out.println("Looking up for 9 ");
//		bst.lookup(9);
//		System.out.println("Looking up for 4 ");
//		bst.lookup(4);
//		System.out.println("Looking up for 20 ");
//		bst.lookup(20);
//		System.out.println("Looking up for 170 ");
//		bst.lookup(170);
//		System.out.println("Looking up for 1 ");
//		bst.lookup(1);
//		System.out.println("Looking up for 15 ");
//		bst.lookup(15);
//		System.out.println("Looking up for 6 ");
//		bst.lookup(6);
//		
//		bst.remove(20);
//		System.out.println("//////////////////");
//		System.out.println("Looking up for 9 ");
//		bst.lookup(9);
//		System.out.println("Looking up for 4 ");
//		bst.lookup(4);
//		System.out.println("Looking up for 20 ");
//		bst.lookup(20);
//		System.out.println("Looking up for 170 ");
//		bst.lookup(170);
//		System.out.println("Looking up for 1 ");
//		bst.lookup(1);
//		System.out.println("Looking up for 15 ");
//		bst.lookup(15);
//		System.out.println("Looking up for 6 ");
//		bst.lookup(6);
//		bst.print(bst.head);
//		Trie abc = null;
//		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
//		Factorial fac  = new Factorial();
//		System.out.println(fac.facRecursive(2));
//		System.out.println(fac.facLoop(2));
//		System.out.println("Looopp ---" + Fibonacci.fibLoop(43));
//		System.out.println("Recursive ---" + Fibonacci.fibRecursive(43));
//		System.out.println(StringReverse.reverse("I am Jawahar "));
		int[] ar = {25,24,23,22,21,20,19,15,14,13,12,11,10,9,8,77,6,5,4,3,2,1,0};
//		BubbleSort.sort(ar);
//		SelectionSort.sort(ar);
//		InsertionSort.sort(ar);
//		MergeSort.sort(ar);
//		QuickSort.sort(ar);
//		HeapSort.heapSort(ar);
//		for(int i=0;i<ar.length;i++)
//		System.out.print(" " + ar[i]);
//		SortingAlgo.bubbleSort(ar);
//		SortingAlgo.selectionSort(ar);
//		SortingAlgo.insertionSort(ar);
//		SortingAlgo.mergeSort(ar);
//		SortingAlgo.quickSort(ar);
//		SortingAlgo.heapSort(ar);
//		System.out.println(SearchingAlgo.binarySearch(ar, 22));
		MyBST bst = new MyBST();
		bst.insert(9);
		bst.insert(4);
		bst.insert(6);
		bst.insert(20);
		bst.insert(170);
		bst.insert(15);
		bst.insert(1);
//		bst.print();	
//		bst.breadthSearch();
//		bst.depthSearchInorder();
//		bst.depthSearchPreOrder();
//		bst.depthSearchPostorder();
		int[] prices = {2,1,1,2};
//		System.out.println(maxProfit(prices));
//		System.out.println(climbStairs(7));
//		System.out.println(rob(prices));
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8};
//		int[] result = intersect(nums1,nums2);
//		for(int i = 0;i<result.length ;i++) {
//			System.out.println(result[i]);
//		}
//		List<List<Integer>> abc = generate(5);
		char sudoku[][]= {
				{'.','8','7','6','5','4','3','2','1'},
				{'2','.','.','.','.','.','.','.','.'},
				{'3','.','.','.','.','.','.','.','.'},
				{'4','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','.','.'},
				{'6','.','.','.','.','.','.','.','.'},
				{'7','.','.','.','.','.','.','.','.'},
				{'8','.','.','.','.','.','.','.','.'},
				{'9','.','.','.','.','.','.','.','.'}
		};
//		System.out.println(isValidSudoku(sudoku));
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//		System.out.println(searchMatrix(matrix,3));
		System.out.println(firstUniqChar("aabb"));
	}
	
	public static String longestString(String sen) {
		String[] sentences = sen.split(" ");
		String longestWord="";
		int maxLen=0;
		for(int i=0;i<sentences.length;i++) {
			String result = sentences[i].replaceAll("\\p{Punct}", "");
			if(result.length() > maxLen) {
				maxLen =result.length();
				longestWord = result;
			}
		}
		return longestWord;
	}
	
// Rotate Efficiency
	public static int[] rotateEff(int[] nums, int k) {
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		return nums;
	}
	
	private static void reverse(int[] nums , int start , int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start++]=nums[end];
			nums[end--]=temp;
		}
	}
	  public static int[] rotate(int[] nums, int k) {
//		  int[] newArr = new int[nums.length];
//		  int counter=0;
//		  for(int i=nums.length-k;i<nums.length;i++) {
//			  newArr[counter++]=nums[i];
//		  }
//		  for(int i=0;i<nums.length-k;i++) {
//			  newArr[counter++]=nums[i];
//		  }
		  int[] newArr = Arrays.copyOf(nums,nums.length);
	      int counter=0;
	      k = k%nums.length;
	      for(int i=nums.length-k;i<nums.length;i++) {
	          nums[counter++]=newArr[i];
	      }
	      for(int i=0;i<nums.length-k;i++) {
	          nums[counter++]=newArr[i];
	      }
		  return nums;
	  }
	  
	 public boolean containsDuplicate(int[] nums) {
		 Arrays.sort(nums);
		 for(int i=0;i<nums.length-1;i++) {
			 if(nums[i]==nums[i+1]) {
				 return true;
			 }
		 }
		 return false;
    }
	 
	 private static int[] moveZeroes(int[] nums) {
		 int nonZero=0;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]!=0) {				 
				 nums[nonZero++]=nums[i];
			 }
		 }
		 while(nonZero<nums.length) {
			 nums[nonZero++]=0;
		 }
		 return nums;
	 }

	private static int maxSubArray(int[] nums) {
		 int sum=0,maxSum=-100000;
		 for(int i=0;i<nums.length ;i++) {
	    	sum= sum+nums[i] > nums[i] ? sum+nums[i] : nums[i];
	    	maxSum = sum > maxSum ? sum : maxSum;
		 }
		 return maxSum;
	 }

	private static String reverse(String input) {
		String[] inputAsArray = input.split("");
		// With Space complexity
//		String[] reversedArray = new String[input.length()];
//		for(int i=input.length()-1, j=0 ;i >=0; i--,j++) {
//			reversedArray[j]=inputAsArray[i];
//		}
//		return String.join("",reversedArray);
		// In place using a variable
		String temp ="";
		for(int i=0, j=input.length()-1 ; i<=j; i++,j--) {
			temp = inputAsArray[i];
			inputAsArray[i]=inputAsArray[j];
			inputAsArray[j]=temp;
		}
		return String.join("", inputAsArray);
	}
	private static boolean findIfItHasPair(List<Integer> nums, int sum) {
		// Without Much Space Complexity
		Set<Integer> map = new HashSet<Integer>();
		for(int i=0; i< nums.size();i++) {
			if(map.contains(nums.get(i))) {
				return true;
			}
			map.add(sum-nums.get(i));
		}
		return false;
		
// 		With Java 8 
//		AtomicBoolean isFound= new AtomicBoolean(false); 
//		nums.stream().forEach(item -> {
//			if(map.contains(item)) {
//				isFound.set(true);
//			}
//			map.add(sum-item);
//		});
//		return isFound.get();
	}
	
	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int i=0,j=0,k=0;
		int[] sorted = new int[arr1.length + arr2.length];
		while(i<arr1.length || j< arr2.length) {			
			if(i>=arr1.length) {
				for( ; j<arr2.length ; j++) {					
					sorted[k++]= arr2[j];
				}
			}
			
			if(j>=arr2.length) {
				for( ; i<arr1.length ; i++) {					
					sorted[k++]= arr1[i];
				}
			}
			
			if(i <arr1.length && j< arr2.length) {				
				sorted[k++]= arr1[i]< arr2[j] ? arr1[i++] : arr2[j++];
			}
		}
		return sorted;
	}
	
	 private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> lookUp= new HashMap<>();
        int[] indices=new int[2];
        for(int i=0;i<nums.length ;i++) {
        	if(Objects.nonNull(lookUp.getOrDefault(nums[i], null))) {
        		indices[0]=lookUp.get(nums[i]);
        		indices[1]=i;
        	} else {
        		lookUp.put(target-nums[i], i);
        	}
        }
        return indices;
	 }
	 
    private static int maxProfit(int[] prices) {
        int firstMin = 9999999;
        int sell=0;
        for(int i=0;i<prices.length;i++) {
        	if(prices[i] < firstMin) {
        		firstMin=prices[i];
        	} else if(prices[i] - firstMin > sell) {
        		sell = prices[i]-firstMin;
        	}
        }
        return sell;
    }
    
    private static int climbStairs(int n) {
    	List<Integer> steps = new ArrayList<Integer>();
    	steps.add(1);
    	steps.add(2);
    	for(int i=2;i<n;i++){
            steps.add(steps.get(i-1) + steps.get(i-2));
        }
        return steps.get(n-1);
    }

    private static int rob(int[] nums) {
    	if(nums.length == 0) {
    		return 0;
    	} else if(nums.length ==1) {
    		return nums[0];
    	} else if(nums.length==2){
    		return Math.max(nums[0], nums[1]);
    	} else {
    		int result=0;
    		int b=Math.max(nums[0], nums[1]);
    		int c=nums[0];
    		for(int i=2;i<nums.length;i++) {
    			result = Math.max(b, c+nums[i]);
    			c= b;
    			b=result;
    		}
    		return result;
    	}
    	
    }
    
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> lookup = new HashMap<Integer,Integer>();
        List<Integer> result = new ArrayList<>();
        for(int i =0 ;i<nums1.length;i++){
            lookup.put(nums1[i] , lookup.getOrDefault(nums1[i],0)+1);
        }
        for(int j =0 ;j<nums2.length  ;j++){
        	if(lookup.getOrDefault(nums2[j],0) > 0) {        		
        		result.add(nums2[j]);
        	}
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        if(numRows == 0) {
            return outerList;
        } else {
            for(int i=0;i<numRows;i++) {
            	List<Integer> innerList = new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0 || j == i) {
                        innerList.add(1);
                    } else {
                        int temp1 = Objects.nonNull(outerList.get(i-1).get(j)) ? outerList.get(i-1).get(j) : 0;
                        int temp2 = Objects.nonNull(outerList.get(i-1).get(j-1)) ? outerList.get(i-1).get(j-1) : 0; 
                        innerList.add(temp1+temp2);
                    }                    
                }
                outerList.add(innerList);
            }
        }
        return outerList;
    }

    // Sudoku
    private static boolean isValidSudoku(char[][] board) {        
    	
	    
    	for(int j=0;j<9;j++){
    		Map<Character,Integer> lookup1 = new HashMap<>();
	        for(int i=0;i<9;i++){
	            if(board[j][i]!='.'){
	                if(lookup1.getOrDefault(board[j][i],0) != 0 ) {
	                    return false;
	                }else {
	                    lookup1.put(board[j][i], 1);             
	                }
	            }
	        }
	    }
    //
	    
	    for(int j=0;j<9;j++){
	    	Map<Character,Integer> lookup2= new HashMap<>();
	        for(int i=0;i<9;i++){
	            if(board[i][j]!='.'){
	                if(lookup2.getOrDefault(board[i][j],0) != 0 ) {
	                    return false;
	                }else {
	                    lookup2.put(board[i][j], 1);             
	                }
	            }
	        }            
	    }
    
    //
	    int m =0,n=0;
	    while(m<9 && n<9){
	    	Map<Character,Integer> lookup3= new HashMap<>();
	        for(int i=m;i<(m+3);i++){
	            for(int j=n;j<(n+3);j++){
	                if(board[i][j]!='.'){
	                     if(lookup3.getOrDefault(board[i][j],0) != 0 ) {
	                        return false;
	                    }else {
	                        lookup3.put(board[i][j], 1);             
	                    }
	                }
	            }
	        }
	        n+=3;
	        if(n>8) {
	            n=0;
	            m+=3;
	        }
	    }
	    
	    return true;
}

    private static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        for(;i<matrix.length && matrix[i][0]<=target;i++){
             //
        }
        int j=0;
        while(j<matrix[i].length){
            if(matrix[i][j] == target) {
                return true;
            }
            j++;
        }
        return false;
    }

    private static  int firstUniqChar(String s) {
    	int[] chars = new int[26];
    	s = s.toUpperCase();
    	for(int i=0;i<s.length();i++) {
    		chars[s.charAt(i)-'A']++;
    	}
    	for(int i=0;i<s.length();i++) {
    		if(chars[s.charAt(i) - 'A'] == 1) {
    			return i;
    		}
    	}
    	return -1;
    }

}
