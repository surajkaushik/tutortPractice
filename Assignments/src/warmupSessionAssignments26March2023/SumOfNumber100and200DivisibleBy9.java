package warmupSessionAssignments26March2023;

public class SumOfNumber100and200DivisibleBy9 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i%9==0) {
				sum+=i;
			}
		}
		System.out.println("Sum is :"+ sum);
	}

}
