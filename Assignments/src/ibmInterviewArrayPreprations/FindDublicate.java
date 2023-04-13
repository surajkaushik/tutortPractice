package ibmInterviewArrayPreprations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDublicate {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 6, 3, 6, 1};
		
		Set<Integer> dublicate = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					dublicate.add(array[i]);
				}
			}
		}
		System.out.println(dublicate);
		System.out.println(Arrays.toString(array));
				
	}

}
