package warmupSessionAssignments26March2023;

import java.util.Scanner;

public class Question1_SumOfAll {
	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		Question1_SumOfAll.sumOfAll(val);
		
	}
	static void sumOfAll(int val) {
		Scanner sc1 = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[val];
		for (int i = 0; i < val; i++) {
			arr[i] = sc1.nextInt();
		}
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Total Sum is: " + sum);
		
	}
}
