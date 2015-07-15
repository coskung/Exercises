package src;

import java.util.HashMap;
import java.util.Map;

public class RemoveRecurringCharacters {
	
	
	public static String removeOccurences(String input, int limit) {
		
	//make a character array with the characters in the input
	char[] karakterler = input.toCharArray();
    HashMap<Character, Integer> karaktersay = new HashMap<Character, Integer>();
    for (char c : karakterler) {
    	if(c!=' '){//do not count spaces
    		if (karaktersay.containsKey(c)) {
    			karaktersay.put(c, karaktersay.get(c) + 1);
    		} else {
    			karaktersay.put(c,1);
    		}
    	}
    }

     String s = input;
    //remove the characters occured more than or equal to limit
    for (Map.Entry<Character, Integer> e: karaktersay.entrySet()) {
        if (e.getValue() >= limit) {
            //System.out.println("harf: " + e.getKey() + "  sayisi " + e.getValue());
            s=s.replaceAll(e.getKey().toString(), "");
            //System.out.println(s);
        }
    }
	return s;
	
	}

}
