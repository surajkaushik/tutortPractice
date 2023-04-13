package ibmInterviewArrayPreprations;

import java.util.Arrays;

public class MinMaxOfArray {

	public static void main(String[] args) {
		int A[] = {3, 2, 1, 56, 10000, 167};
		int min=A[0],max=A[0];
		
		//using sorting
		Arrays.sort(A);
		System.out.println(A[0]);
		System.out.println(A[A.length-1]);
		
		
		//using for loop		
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) max=A[i];
			if(A[i]<min) min=A[i];
		}
		System.out.println(min);
		System.out.println(max);
		
		
	}

}
