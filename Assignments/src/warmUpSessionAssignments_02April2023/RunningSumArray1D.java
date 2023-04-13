package warmUpSessionAssignments_02April2023;

public class RunningSumArray1D {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int ans[]=new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j <=i; j++) {
				sum+=arr[j];
				ans[i]=sum;
			}
		}
		for (int i : ans) {
			System.out.print(i+" ");
		}

	}

}
