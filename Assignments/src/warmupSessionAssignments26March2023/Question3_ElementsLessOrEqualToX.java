package warmupSessionAssignments26March2023;

public class Question3_ElementsLessOrEqualToX {
	public static void main(String[] args) {
		int n=6,x=9;
		int a[]={1, 2, 4, 5, 8, 10};
		Question3_ElementsLessOrEqualToX.elementsLessOrEqualToX(a, x);
	}
	static void elementsLessOrEqualToX(int a[],int x) {
		int count=0;
		for (int i : a) {
			if(i<=x) {
				count++;
			}
		}
		System.out.println(count);
	}
}
