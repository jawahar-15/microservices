package datastructures;

public class Factorial {

	public int facRecursive(int val) {
		if(val <= 1) {
			return 1;
		} else {			
			return val * facRecursive(val-1); 
		}
	}
	
	public int facLoop(int val) {
		int fact = 1;
		while(val > 0) {
			fact*=val--;
		}
		return fact;
	}
}
