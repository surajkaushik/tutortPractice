package warmupSessionAssignments26March2023;

import java.util.Scanner;

public class PrintElementAtIndex_Question2 {
	public static void main(String[] args) {
		System.out.println("Please the size of Array and Index no. :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int index = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		PrintElementAtIndex_Question2.element(arr, index);
	}
	static void element(int arr[],int index) {
		System.out.println("Element at index is " + arr[index]);
	}

}
