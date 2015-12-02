
package mylistiterator;

import java.util.ArrayList;

public class TestDrive {
    
    public static void main(String[] args) {
        
        MyStringIterator stringIterator = new MyStringIterator("Здравствуй новая строка!");
        
        // проверяем MyStringIterator
        while(stringIterator.hasNext()){
            String s = stringIterator.next();
            System.out.println(s);
        }
        
        System.out.println("");
        System.out.println(stringIterator.previous());
        System.out.println(stringIterator.previous());
        System.out.println(stringIterator.previous());
        System.out.println(stringIterator.previous());
        System.out.println(stringIterator.previous());
        System.out.println(stringIterator.previous());
        System.out.println("");
        
        // проверяем MyArrayIterator
        MyArrayIterator arrayIterator = new MyArrayIterator(new ArrayList());
        arrayIterator.add("Теперь");
        arrayIterator.add("проверяем");
        arrayIterator.add("этот");
        arrayIterator.add("MyArrayIterator!");
        
        while(arrayIterator.hasNext()){
            String s = (String)arrayIterator.next();
            System.out.println(s);
        }
        
        System.out.println("");
        System.out.println(arrayIterator.previous());
        System.out.println(arrayIterator.previous());
        arrayIterator.remove();
        System.out.println("");
        
        while(arrayIterator.hasNext()){
            String s = (String)arrayIterator.next();
            System.out.println(s);
        }
        
    }
    
}
