package warmupSessionAssignments26March2023;

public class IndexValueCompare_Question5 {
	public static void main(String[] args) {
		int arr[] = { 15, 2, 45, 12, 7 };
		IndexValueCompare_Question5.compare(arr);
	}

	static void compare(int arr[]) {
		for(int i=1;i<=arr.length;i++) {
			if(i==arr[i-1])
			    System.out.print(arr[i-1]+" ");
		}
	}
}
