package datastructures;

public class SortingAlgo {

	// Bubble Sort
	public static void bubbleSort(int ar[]) {
		int i =0 ;
		int n = ar.length;
		int temp = 0;
		while(i<n) {
			for(int j=0;j<n-i-1;j++) {
				if(ar[j+1] < ar[j]) {
					temp= ar[j+1];
					ar[j+1]= ar[j];
					ar[j] = temp;
				}
			}
			i++;
		}
		printArray(ar,"Bubble Sort");
	}
	
	// Selection Sort
	public static void selectionSort(int[] ar) {
		int temp =0;
		int pointer = 0;
		for(int i=0 ;i< ar.length;i++) {
			pointer = i;
			for(int j=i+1; j<ar.length ;j++) {
				pointer = ar[j] < ar[pointer] ? j  : pointer; 
			}
			if(i != pointer) {
				temp = ar[i];
				ar[i]=ar[pointer];
				ar[pointer]=ar[i];
			}
		}
		printArray(ar,"Selection Sort");
	}

	// Insertion Sort -> useful when array size is less and is already almost sorted
	public static void insertionSort(int[] ar) {
		int temp=0;
		int j=0;
		for(int i=0 ;i <ar.length-1;i++) {
			j=i+1;
			while(j>0 && ar[j-1] > ar[j] ) {
				temp = ar[j];
				ar[j]=ar[j-1];
				ar[j-1]=temp;
				j--;
			}
		}
		printArray(ar, "Insertion Sort");
	}
	
	// Merge Sort -> Widely used - > Time Complexity: O(n log n) & O(n) : Space Complexity
	public static void mergeSort(int[] ar) {
		performMergeSort(ar,0,ar.length-1);
		printArray(ar, "Merge Sort");
	}
	
	private static void performMergeSort(int[] ar,int low , int high) {
		if(low<high) {
			int mid = (low+high)/2;
			performMergeSort(ar,low,mid);
			performMergeSort(ar,mid+1,high);
			merge(ar,low,mid,high);
		}
	}
	
	private static void merge(int[] ar,int low,int mid,int high) {
		int i = low;
		int j = mid+1;
		int mergedArray[] = new int[high-low+1];
		int k=0;
		
		while(i<j) {
			if(ar[i] <= ar[j]) {
				mergedArray[k++] = ar[i++];
			} else {
				mergedArray[k++] = ar[j++];				
			}
		}
		while(i<=mid) {
			mergedArray[k++]=ar[i++];
		}
		while(j<=high) {
			mergedArray[k++]=ar[j++];
		}

		for(int z=low;z<=high;z++) {
			ar[z]=mergedArray[z-low];
		}
	}
	
	// Quick Sort -> Time Complexity(O(n log n )) ; Space Complexity(O(log n )); Worst Case O(n^2)
	public static void quickSort(int ar[]) {
		performQuickSort(ar,0,ar.length-1);
		printArray(ar, "Quick Sort");
	}
	
	private static void performQuickSort(int[] ar,int low , int high) {
		if(low < high) {
			int pivot = partition(ar,low,high);
			performQuickSort(ar,low,pivot-1);
			performQuickSort(ar,pivot+1,high);
		}
	}
	
	private static int partition(int[] ar, int low , int high) {
		int i = low;
		int j = high;
		int pivot = ar[i];
		int temp =0;
		while(i<j) {
			while(i<high && ar[i]<=pivot) {
				i++;
			}
			while(ar[j]>pivot) {
				j--;
			}
			if(i<j) {
				temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		temp = ar[j];
		ar[j]=ar[low];
		ar[low]=temp;
		return j;
	}
	
	// Heap Sort -> Time Complexity: O(n logn) ; Space Complexity: O(1)
	public static void heapSort(int[] ar) {
		// Building heap
		int n = ar.length;
		for(int i=n/2-1; i>=0;i--) {
			heapify(ar,n,i);
		}
		
		// Delete the max node and again heapify
		for(int j=ar.length-1; j>=0;j--) {
			int temp = ar[0];
			ar[0]=ar[j];
			ar[j]=temp;
			heapify(ar,j,0);
		}
		printArray(ar, "Heap Sort");
	}
	
	private static void heapify(int[] ar ,int size, int index) {
		int max = index;
		int n = size;
		int left = index*2+1;
		int right = index*2+2;
		int temp=0;
			if(left <n && ar[left] > ar[max]) {
				max = left;
			}
			if(right <n && ar[right] > ar[max]) {
				max = right;
			}
			if(max !=index) {
				temp = ar[index];
				ar[index] = ar[max];
				ar[max]=temp;
				heapify(ar,n,max);
		}
	}
	
	private static void printArray(int[] ar, String text) {
		System.out.print("After " + text +": ");
		for(int k=0 ; k<ar.length ;k++) {
			System.out.print(" " + ar[k]);
		}
		System.out.println();
	}

}
