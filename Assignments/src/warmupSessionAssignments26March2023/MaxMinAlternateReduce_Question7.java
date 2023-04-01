package warmupSessionAssignments26March2023;

import java.util.Arrays;

public class MaxMinAlternateReduce_Question7 {
	public static void main(String[] args) {
		int A[] = {7, 8, 3, 4, 2, 9, 5};
		MaxMinAlternateReduce_Question7.maxMinAlternateReduce(A);
	}

	private static void maxMinAlternateReduce(int[] a) {
		Arrays.sort(a);
		if(a.length%2==0) {
			System.out.println(a[a.length/2]);
		}else {
			System.out.println(a[a.length/2]);
		}
	}

}
