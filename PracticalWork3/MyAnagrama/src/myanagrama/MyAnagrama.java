
package myanagrama;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MyAnagrama {
    
    private ArrayList<String> anagrams = new ArrayList<>();
     
    public static void main(String[] args) {
        MyAnagrama myAnagrama = new MyAnagrama();
        myAnagrama.fillContent();
        myAnagrama.groupContent(myAnagrama.anagrams);
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
            else return false;
	}
        
	return anagrama.isEmpty();
    }
    
    public void groupContent(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();
        int i = 0;
        
        String word = list.get(i);
        
        for(String str : list){
            if(isAnagrama(word, str)){
                newList.add(str);
                list.remove(str);
            }
        }
        
        newList.add(word);
        list.remove(word);
        
        System.out.println("Анаграммы к слову " + word + ":");
        for(String s : newList){
            System.out.println(s);
        }
    }
    
}
