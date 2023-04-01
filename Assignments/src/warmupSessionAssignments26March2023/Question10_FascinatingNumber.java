package warmupSessionAssignments26March2023;

public class Question10_FascinatingNumber {
	public static void main(String[] args) {
		int n = 192;
		Question10_FascinatingNumber.checkFascinating(n);
	}

	private static void checkFascinating(int n) {
		int count = 0;
		int All9ValueCheck = 0;
		int temp = n;
		int x=0;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		if (count < 3) {
			System.out.println("Not Fascinating");
		} else {
			String s = String.valueOf(n) + String.valueOf(n * 2) + String.valueOf(n * 3);
			char arr[] = new char[s.length()];
			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i);
			}
			
			for (char i = '1'; i <= '9'; i++) {
				
				if(i==arr[x]) {
					x++;
					All9ValueCheck++;
					
				}
			}
			System.out.println(All9ValueCheck);
		}

	}
}
