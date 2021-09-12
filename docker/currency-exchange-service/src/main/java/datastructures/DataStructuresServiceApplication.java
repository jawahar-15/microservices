package datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
		
		int[] numbers = {1,2,3,4,5,6,7};
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
		
		MyDoublyLinkedList mydll = new MyDoublyLinkedList(1);
		mydll.append(2);
		mydll.append(3);
		mydll.prepend(0);
		mydll.prepend(-1);
		mydll.insertAt(5, 4);
		mydll.reverse();
		mydll.print();
//		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
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
}
