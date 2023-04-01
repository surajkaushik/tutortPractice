package warmupSessionAssignments26March2023;

import java.util.Arrays;

public class Question7_MaxMinAlternateReduce {
	public static void main(String[] args) {
		int A[] = {7, 8, 3, 4, 2, 9, 5};
		//int A[] = {8, 1, 2, 9, 4, 3, 7, 5};
		Question7_MaxMinAlternateReduce.maxMinAlternateReduce(A);
	}

	private static void maxMinAlternateReduce(int[] a) {
		Arrays.sort(a);
		int x= a.length%2==0?a[(a.length/2)-1]:a[a.length/2];
		System.out.println(x);
	}

}
 