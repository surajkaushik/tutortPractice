package warmupSessionAssignments26March2023;

import java.util.Scanner;

public class RightAngleTriangleWithNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int val= sc.nextInt();
		RightAngleTriangleWithNumbers.PrintTriangle(val);
	}
	
	static void PrintTriangle(int value) {
		for(int i=1;i<=value;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
