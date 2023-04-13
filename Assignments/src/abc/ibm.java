package abc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ibm {

	public static void main(String[] args) {
	String s ="My name is Suraj kaushik suraj";
	Map<Character, Integer> map= new HashMap<>();
	s=s.replaceAll(" ","");
	System.out.println(s);
	for (int i = 0; i < s.length(); i++) {
		char c= s.charAt(i);
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	Set key= map.keySet();
	System.out.println(key);
	
//	List<String> l=(List<String>) key.stream().filter(x->(Character.valueOf((char) x)=='M')||Character.valueOf((char) x)=='m').collect(Collectors.toList());
//	l.stream().forEach(x->System.out.println(x));
	
	}

}
