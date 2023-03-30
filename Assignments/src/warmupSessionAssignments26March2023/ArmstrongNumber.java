package warmupSessionAssignments26March2023;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		String ans=ArmstrongNumber.checkArmstrongNumber(val);
		System.out.println(ans);

	}

	public static String checkArmstrongNumber(int value) {
		int count = 0, sum = 0, last;
		int temp = value;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		temp = value;
		while (temp > 0) {
			last = temp % 10;
			sum += Math.pow(last, count);
			temp = temp / 10;
		}
		if (value == sum)
			return "Armstrong Number";
		else
			return "Not a Armstrong Number";
	}
}
