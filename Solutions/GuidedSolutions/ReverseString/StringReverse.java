import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		//some strings to test your function
		String strings[] = new String[]{"Hacktoberfest", "Coding is fun", "Another string"};
		
		for(int i=0; i<strings.length; i++) {
			System.out.println(reverseString(strings[i]));
		}
	
		/*
		expected output:
			tsefrebotkcaH
			nuf si gnidoC
			gnirts rehtonA	   
		*/

	}

	public static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
