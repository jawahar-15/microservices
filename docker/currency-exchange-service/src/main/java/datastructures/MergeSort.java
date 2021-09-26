package datastructures;

public class MergeSort {

	public static void sort(int[] array) {
		mergeSort(array,0,array.length-1);
		for(int i=0;i<array.length ;i++) {			
			System.out.println(array[i]);
		}
	}
	
	private static void mergeSort(int[] array,int low , int high) {
		if(low < high) {
			int mid = (low+high)/2;
			mergeSort(array,low,mid);
			mergeSort(array,mid+1,high);
			merge(array,low,mid,high);
		}
	}
	
	private static void merge(int[] array, int low, int mid, int high) {
		int i=low,j=mid+1,k=0;
		int[] mergedAr = new int[high-low+1];
		
		while(i<=mid && j<=high) {
			if(array[i] < array[j]) {
				mergedAr[k++]=array[i++];
			} else {
				mergedAr[k++]=array[j++];
			}
		}
		
		while(i<=mid) {
			mergedAr[k++]=array[i++];
		}

		while(j<=high) {
			mergedAr[k++]=array[j++];
		}
		
		for(int z=low;z<=high;z++) {
			array[z]=mergedAr[z-low];
		}
		System.out.println();
	}
	
	
}
