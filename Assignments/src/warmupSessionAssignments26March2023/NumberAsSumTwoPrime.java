package warmupSessionAssignments26March2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAsSumTwoPrime {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int val= sc.nextInt();
		NumberAsSumTwoPrime.checkNumber(val);
	}
	public static void checkNumber(int value) {
		List<Integer> l = new ArrayList<>();
		for(int i=2;i<=value;i++) {
			int temp=i;
			for(int j=temp;j<Math.sqrt(temp);j++) {
				if(temp%j!=0) {
					l.add(temp);
				}
			}
		}
		System.out.println(l);
	}

}
