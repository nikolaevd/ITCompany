
package myanagrama;

import java.util.ArrayList;

public class MyAnagrama {
  
    private final ArrayList<String> anagrams;
    
    public MyAnagrama(){
        anagrams = new ArrayList<>();
    }
      
    public static void main(String[] args) {
        MyAnagrama anagrama = new MyAnagrama();
        anagrama.fillContent();
        anagrama.printAnagramsByGroup();
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
    
    public void printAnagramsByGroup(){
        ArrayList<String> newList;
        String word;
        
        for(String s1 : anagrams){
            newList = new ArrayList<>();
            word = s1;
            
            for(String s2 : anagrams){
                if(isAnagrama(word, s2)){
                    newList.add(s2);
                }
            }
            
            if(newList.size() > 1){
                System.out.println("Анаграммы к слову " + word + ":");
                for(String s : newList){
                    System.out.println(s);
                }   
            }
            System.out.println("");
        }
    }
    
}
