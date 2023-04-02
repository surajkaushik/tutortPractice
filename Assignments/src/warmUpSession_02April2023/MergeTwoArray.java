package warmUpSession_02April2023;

import java.util.Arrays;

public class MergeTwoArray {
//	Conditions
//	arrays are sorted in increasing order 
//	Size of arrays could be different 
//	Arrays are sorted 
//	It can have +ve or -ve numbers.  
//	Non of the arrays will be null, at-least 1 element would be there in array 
//	Merged array to be sorted in increasing order. 
//	Arrays can have repeated values. 
	public static void main(String[] args) {
		int a[] = { 213, 32, 12, -1, 23, 0, 534 };
		int b[] = { 12, 32, 11, 21, 32, 43, 54,-21, 32, -321, -9 ,321};
		MergeTwoArray.mergeApproach1(a, b);
		System.out.println();
		MergeTwoArray.mergeApproach2(a, b);
		System.out.println();
		MergeTwoArray.mergeApproach3(a, b);
	}
	//Using for loop - just adding 2 array directly
	private static void mergeApproach1(int[] a, int[] b) {
		int mergedArray[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			mergedArray[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			mergedArray[a.length + i] = b[i];
		}
		Arrays.sort(mergedArray);
		for (int i : mergedArray) {
			System.out.print(i+" ");
		}
	}
	//Using While loop - just adding 2 array directly
	private static void mergeApproach2(int[] a, int[] b) {
		int mergedArray[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length) {
			mergedArray[k++] = a[i++];
		}
		while (j < b.length) {
			mergedArray[k++] = b[j++];
		}
		Arrays.sort(mergedArray);
		for (int aa : mergedArray) {
			System.out.print(aa+" ");
		}
	}
	
	//Using While loop , works on sorted array only - comparing two element in 1st loop and adding the minimum element and 
	//while if it reaches a condition where i is array out of bound then it will goto next two loop and add the left over elements
	private static void mergeApproach3(int[] a, int[] b) {
		// Merge for Sorted Arrays
		int mergedArray[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		//for comparing and adding , below two arrays are for adding left over array.
		while (i < a.length && j < b.length) { // checking if i and j are less than the index if they get broke it will goto next condition
			if (a[i] < b[j]) {
				mergedArray[k++] = a[i++];
			} else {
				mergedArray[k++] = b[j++];
			}
		}
		while(i<a.length) {  // like if i size is 2 and i=2 so it will goto next loop and copy the left over array
			mergedArray[k++] = a[i++];
		}
		while(j<a.length) { // left over element to be copied.
			mergedArray[k++] = b[j++];
		}
		for (int aa : mergedArray) {
			System.out.print(aa+" ");
		}
	}

}
