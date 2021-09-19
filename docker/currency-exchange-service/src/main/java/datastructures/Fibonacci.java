package datastructures;

public class Fibonacci {

	public static int fibRecursive(int n) {
		int first =0;
		int second = 1;
		if(n == 0) {
			return first;
		} else if(n==1) {
			return second;
		} else {
			return fibRecursive(n-1)+ fibRecursive(n-2);
		}
		
	}

	public static int fibLoop(int n) {
		int first = 0;
		int second = 1;
		int sum=0;
		if(n==0) {
			return first;
		} else if (n==1) {
			return second;
		} else {
			while(n > 1) {
				sum= first+second;
				first=second;
				second=sum;
				n--;
			}
			return sum;
		}
	}

}
