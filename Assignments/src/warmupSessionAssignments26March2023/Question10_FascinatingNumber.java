package warmupSessionAssignments26March2023;

public class Question10_FascinatingNumber {
	public static void main(String[] args) {
		int n = 192;
		System.out.println(Question10_FascinatingNumber.checkFascinating(n));
	}
	  static String checkFascinating(int n){
          int m2=n*2,m3=n*3;
          String num =n+""+m2+m3;
          boolean fascinating = true;  
          for(char c='1';c<='9';c++){  
              int count = 0;  
              for(int i=0;i<num.length();i++){
                  char ch = num.charAt(i);
                  if(ch == c)  
                      count++;  
              }  
              if(count > 1 || count == 0){
                  fascinating = false;  
                  break;  
              }  
          }  
          if(fascinating)  
              return num + " is a fascinating number.";  
          else  
              return num + " is not a fascinating number."; 
  }
	
}
