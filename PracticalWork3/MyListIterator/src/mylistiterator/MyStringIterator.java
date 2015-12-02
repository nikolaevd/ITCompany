
package mylistiterator;

import java.util.ListIterator;

public class MyStringIterator implements ListIterator<String> {
    
    private final String str;
    private int previousIndex = -1;
    private int nextIndex = 0;
    private int lastReturned = 0;
    
    public  MyStringIterator(String str) {
        this.str = str;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < str.length();
    }

    @Override
    public String next() {
        lastReturned = nextIndex;
        previousIndex = nextIndex;
        nextIndex++;
        return str.substring(lastReturned, nextIndex);
    }

    @Override
    public boolean hasPrevious() {
        return previousIndex >= 0 && previousIndex < str.length();
    }

    @Override
    public String previous() {
        lastReturned = previousIndex;
        nextIndex = previousIndex;
        previousIndex--;
        return str.substring(previousIndex, nextIndex);
    }

    @Override
    public int nextIndex() {
        return nextIndex;
    }

    @Override
    public int previousIndex() {
        return previousIndex;
    }

    @Override
    public void remove() {
        // метод является опциональным и не реализуется, т.к. тип String - Immutable
        throw new UnsupportedOperationException("Not supported yet.");
    }   
    
    @Override
    public void set(String e) {
        // метод является опциональным и не реализуется, т.к. тип String - Immutable
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(String e) {
        // метод является опциональным и не реализуется, т.к. тип String - Immutable        
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
}
