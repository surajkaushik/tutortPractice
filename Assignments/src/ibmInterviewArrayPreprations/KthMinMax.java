package ibmInterviewArrayPreprations;

import java.util.Arrays;

public class KthMinMax {
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15}, K = 4 ;
		Arrays.sort(arr);
		System.out.println(arr[K-1]);
	}
}
