package warmupSessionAssignments26March2023;

import java.util.Arrays;

public class First2MaxElementsInSinglePass {

	public static void main(String[] args) {
		int input[] = { 21, 32, -1, 23, 0, 423, 400, 21, 8, -2, 900 };
		First2MaxElementsInSinglePass.find2Max(input);
	}

	private static void find2Max(int[] input) {

		// Approach using single pass
		if (input == null || input.length == 0 || input.length == 1) {
			System.out.println("Size is 0 || Null || size is 1");
			return;
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max1) {
				max2 = max1;
				max1 = input[i];
			} else if (input[i] > max2 && max2 != max1) {
				max2 = input[i];
			}
		}
		System.out.println("Max 1 :" + max1);
		System.out.println("Max 2 :" + max2);

//		//Approach using Sorting
//		Arrays.sort(input);
//		System.out.println("Max 1 :"+input[input.length-1]);
//		System.out.println("Max 2 :"+input[input.length-2]);

	}

}
