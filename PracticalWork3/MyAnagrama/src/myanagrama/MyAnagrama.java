
package myanagrama;

import java.util.LinkedList;
import java.util.List;

public class MyAnagrama {
    
    private final List anagrams;

    public MyAnagrama() {
        anagrams = new LinkedList();       
    }
     
    public static void main(String[] args) {
        MyAnagrama myAnagrama = new MyAnagrama();
        myAnagrama.fillContent();
    }

    public boolean isAnagrama(String word, String anagrama) {
	if (word.length() != anagrama.length()) {
            return false;
	}
	char[] chars = word.toCharArray();
	for (char c: chars) {
            int index = anagrama.indexOf(c);
            if (index != -1) {
                anagrama = anagrama.substring(0, index) + anagrama.substring(index + 1, anagrama.length());
            } 
            else {
                return false;
            }
	}
        
	return anagrama.isEmpty();
    }
    
    public void fillContent(){
        anagrams.add("роза");
        anagrams.add("азор");
        anagrams.add("лапа");
        anagrams.add("озар");
        anagrams.add("апал");
        anagrams.add("лоза");
        anagrams.add("лук");
        anagrams.add("кул");
        anagrams.add("кол");
        anagrams.add("лак");
        anagrams.add("рожа");
        anagrams.add("жора");
    }
    
}
