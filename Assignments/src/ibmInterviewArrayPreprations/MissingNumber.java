package ibmInterviewArrayPreprations;

public class MissingNumber {
public static void main(String[] args) {
	int arr[] = {1, 2, 5, 6, 3, 7, 9}, N = 8;
	int sum=0;
	for (int i : arr) {
		sum+=i;
	}
	int total= (N*(N+1))/2;
	System.out.println(total-sum);
}
}
