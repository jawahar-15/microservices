package datastructures;

public class Fibonacci {

	public static int calc=0;
	public static void main(int[] ...args) {
		System.out.println(fibRecursive(20));
		System.out.println("Calc Value :" + calc);
	}
	public static int fibRecursive(int n) {
		calc++;
		System.out.println("Calc value" + calc);
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
