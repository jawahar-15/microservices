package datastructures;

public class SearchingAlgo {

	public static boolean binarySearch(int[] ar, int n) {
		return performBinarySearch(ar, 0, ar.length-1, n);
	}
	
	private static boolean performBinarySearch(int[] ar,int low,int high,int n ) {
		int mid = (low+high)/2;
		if(mid!=low) {
			if(ar[mid]==n) {
				return true;
			} else if(ar[mid] < n) {
				return performBinarySearch(ar,mid,high,n);
			} else if(ar[mid] > n) {
				return performBinarySearch(ar,low,mid,n);			
			} 
		}
		return false;
		
	}
}
