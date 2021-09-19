package datastructures;

public class SelectionSort {

	// Start at index 0 . Search through the rest of the array to find the smallest element and replace it with index.
	public static void sort(int[] array) {
		int length = array.length;
		int counter=0;
		for(int i=0;i<length-1;i++) {
			counter=i;
			for(int j=i+1; j<array.length ;j++) {
				counter = array[j] < array[counter] ? j : counter;
			}
			int temp = array[counter];
			array[counter]= array[i];
			array[i]= temp;
		}
		for(int i=0;i<array.length;i++) {			
			System.out.println(array[i]);
		}
	}
}
