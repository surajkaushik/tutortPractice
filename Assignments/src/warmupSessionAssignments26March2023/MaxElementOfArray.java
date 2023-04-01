package warmupSessionAssignments26March2023;

import java.util.Arrays;

public class MaxElementOfArray {

	public static void main(String[] args) {
		//int a[] = { 2, -54, -23, 50, 1, 5, 23 };
		//int a[]= new int[0]; // ----- Size is Zero 0
		//int a[]=null; // ---- Null 
		int a[]= {}; // Size is 0
		if(a==null || a.length==0) {
			if(a==null) {System.out.println("Null");}
			else if(a.length==0) {System.out.println("Size 0");}
			return;
		}
		
		int min=a[0],max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {max=a[i];}
			if(a[i]<min) {min=a[i];}
		}
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	
		
		
//		Arrays.sort(a);
//		System.out.println(a[a.length-1]);
		
//		int max = a[0];
//		for (int i : a) {
//			if (max < i) {
//				max = i;
//			}
//		}
//		System.out.println(max);
	}

}
