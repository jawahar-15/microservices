package datastructures;

public class HeapSort {

	public static void heapSort(int[] ar) {
		int n = ar.length;
		for(int i=n/2-1 ;i>=0 ;i--) {
			maxheapify(ar,n,i);
		}
		for(int i=n-1 ;i>=0 ;i--) {
			int temp = ar[i];
			ar[i]=ar[0];
			ar[0]=temp;
			maxheapify(ar,i,0);
		}
		
	}
	
	private static void maxheapify(int[] ar,int n ,int index) {
		int max = index;
		int left = 2*index+1;
		int right = 2*index+2;
		
		if(left < n && ar[left] > ar[max]) {
			max = left;
		}

		if(right < n && ar[right] > ar[max]) {
			max = right;
		}
		if(max!=index) {
			int temp = ar[max];
			ar[max]=ar[index];
			ar[index]=temp;
			maxheapify(ar, n, max);
		}

	}
}
