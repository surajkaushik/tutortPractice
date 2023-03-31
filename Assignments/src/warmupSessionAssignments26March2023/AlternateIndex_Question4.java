package warmupSessionAssignments26March2023;

public class AlternateIndex_Question4 {
	public static void main(String[] args) {
	int n = 5;
	int A[] = {1, 2, 3, 4,5};
	AlternateIndex_Question4.alternateIndex(A);
	}
	static void alternateIndex(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			i++;
		}
	}
}
