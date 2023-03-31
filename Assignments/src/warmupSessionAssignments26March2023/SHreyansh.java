package warmupSessionAssignments26March2023;
class A{
	static String retrunValue;
	public static String function(String name) {
		
		switch (name) {
		case "Suraj":retrunValue= "Suraj";break;
		case "Shreyansh":retrunValue= "Shreyansh";break;
		case "Yuvraj":retrunValue= "Yuvraj";break;
		case "Kartik":retrunValue= "Kartik";break;
		default: retrunValue="Wrong";break;
		}
		return retrunValue;
	}
}

public class SHreyansh {
	public static void main(String[] args) {
		if(A.function("Suraj").equals("Suraj")) {
			System.out.println("Value "+ A.function("Suraj"));
		}
		else {
			System.out.println("Wrong Case");
		}
		
	}
}
