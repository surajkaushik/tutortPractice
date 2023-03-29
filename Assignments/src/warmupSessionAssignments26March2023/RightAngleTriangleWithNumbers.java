package warmupSessionAssignments26March2023;

import java.util.Scanner;

public class RightAngleTriangleWithNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int val= sc.nextInt();
		
		for(int i=1;i<=val;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
