package ibmInterviewArrayPreprations;

import java.util.Collections;
import java.util.Comparator;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[]= new int[arr.length];	
		for (int i = 0; i < arr.length; i++) {
		arr2[arr.length-1-i]=arr[i];
	}
		for (int i : arr2) {
			System.out.print(i);
		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
