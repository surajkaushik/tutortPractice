package warmUpSessionAssignments_02April2023;

public class Jewels_and_Stones_771 {

	public static void main(String[] args) {
		String jewels = "aA", stones = "aAAbbbb";
		calculateStone(jewels, stones);
	}

	private static void calculateStone(String jewels, String stones) {
		int count = 0;
		char j[] = jewels.toCharArray();
		char s[] = stones.toCharArray();
		for (int i = 0; i < j.length; i++) {
			for (int k = 0; k < s.length; k++) {
				if (j[i] == s[k]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
