package datastructures;

public class QuickSort {

	public static void sort(int[] ar) {
		quickSort(ar,0,ar.length-1);
		for(int i=0;i<ar.length ;i ++) {
			System.out.print(" " + ar[i]);
		}
	}
	
	private static void quickSort(int[] ar,int low, int high) {
		if(low < high) {
			int pivot = partition(ar,low,high);
			quickSort(ar , low , pivot-1);
			quickSort(ar , pivot+1 , high);
		}
	}
	
	private static int partition(int[] ar , int low , int high) {
		int i = low, j = high;
		int pivot = ar[i];
		
		while(i < j ) {
			while(i<high && ar[i]<=pivot) {
				i++;
			}
			
			while(ar[j]>pivot) {
				j--;
			}
			if(i < j) {
				int temp = ar[i];
				ar[i]= ar[j];
				ar[j]= temp;
			}
		}
		int temp = ar[low];
		ar[low]= ar[j];
		ar[j]= temp;
		return j;
	}
}
