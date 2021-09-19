package datastructures;

public class StringReverse {

	public static String reverse(String str) {
		if(str.length() <= 1) {
			return str;
		} else {
			return (reverse(str.substring(str.length()/2 , str.length())) + reverse(str.substring(0,((str.length()/2)))));
		}
	}
}
