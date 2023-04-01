package warmupSessionAssignments26March2023;

import java.util.Arrays;

public class Question8_ExceptTwoGreatestInSortedOrder {

	public static void main(String[] args) {
		int a[] = { 2, 8, 7, 1, 5,1,43,54,65 };
		Question8_ExceptTwoGreatestInSortedOrder.exceptTwoGreatestInSortedOrder(a);
	}

	private static void exceptTwoGreatestInSortedOrder(int[] a) {

		Arrays.sort(a);
		for(int i=0;i<a.length-2;i++) {
			System.out.println(a[i]);
		}

	}
}
