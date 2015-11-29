
package myanagrama;

import java.util.ArrayList;

public class MyAnagrama {
    
    private ArrayList<String> list = new ArrayList();
    // выбрать реализацию Map для группировки слов
    
    public static void main(String[] args) {
        MyAnagrama anagrama = new MyAnagrama();
        anagrama.fillContent();
        
    }
    
    public void fillContent(){
        list.add("роза");
        list.add("азор");
        list.add("лапа");
        list.add("озар");
        list.add("апал");
        list.add("лоза");
        list.add("лук");
        list.add("кул");
        list.add("кол");
        list.add("лак");
        list.add("рожа");
        list.add("жора");
    }
    
}
