package warmupSessionAssignments26March2023;

import java.util.Scanner;

public class PyramidWithIncreasingNumber {
	static int x=1;
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int val= sc.nextInt();
		
		for(int i=1;i<=val;i++)
		{
			for(int j=val;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}

}
