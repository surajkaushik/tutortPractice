package ibmInterviewArrayPreprations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dutch_National_Flag_problem {
//	Given N balls of colour red, white or blue arranged in a line in random order.
//	You have to arrange all the balls such that the balls with the same colours are 
//	adjacent with the order of the balls, with the order of the colours being red, white and blue 
//	(i.e., all red coloured balls come first then the white
//			coloured balls and then the blue coloured balls). 

	public static void main(String[] args) {
		int input[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		//String input[] = { "red", "blue", "yellow", "red", "blue", "yellow", "red", "blue", "yellow" };
		solve(input);
	}

	
//	private static void solve(int[] input) {
//		int count=0;
//		int arr[]= new int[input.length];
//		for(int i=0;i<=2;i++) {
//			for(int j=0;j<input.length;j++) {
//				if(i==input[j]) {
//					arr[count++]=input[j];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}

//	private static void solve(String[] input) {
//		List<String> s = new ArrayList<>();
//		List<String> colour=List.of("red", "blue", "yellow");
//		for (String c : colour) {
//			for (String i : input) {
//				if(c==i) {
//					s.add(i);
//				}
//			}
//		}
//		System.out.println(s);
//	}

	private static void solve(int[] input) {
		List<Integer> val = new ArrayList<>();
		for(int i=0;i<=2;i++) {
			for (int j = 0; j < input.length; j++) {
				if(i==input[j]) {
					val.add(input[j]);
				}
			}
		}
		System.out.println(val);
	}

}
