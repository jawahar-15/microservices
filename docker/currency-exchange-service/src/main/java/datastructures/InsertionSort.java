package datastructures;

public class InsertionSort {

	public static void sort(int[] array) {
		int j=0;
		for(int i=0;i<array.length-1;i++) {
			j=i+1;
			while(j>0 && array[j] < array[j-1]) {
				int temp = array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
				j--;
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
