package abc;

import java.util.Arrays;
import java.util.Iterator;

public class Other {
	public static void main(String[] args) {
		int arr[]= {4,2,1,5,10,20,20};
		int max1=0,max2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1){
				max2=arr[i];
			}
		}
		System.out.println(max2);
		
		
	}
}
