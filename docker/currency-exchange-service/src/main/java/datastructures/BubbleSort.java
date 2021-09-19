package datastructures;

public class BubbleSort {

	// Just compare i and i+1th element all through the array until the length of the array.
	public static void sort(int[] array) {
		int length = array.length;
		int exclude =0;
		while(length-- > 0) {
			for(int i=0;i < (array.length-1-exclude);i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i+1];
					array[i+1]= array[i];
					array[i] = temp;
				}
			}
			exclude++;
		}
		for(int i=0;i<array.length;i++) {			
			System.out.println(array[i]);
		}
	}
}
