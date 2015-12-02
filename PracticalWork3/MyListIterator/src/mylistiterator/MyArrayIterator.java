
package mylistiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyArrayIterator implements ListIterator<Object>{
    
    private final ArrayList array;
    private int previousIndex = -1;
    private int nextIndex = 0;
    private int lastReturned = 0;
    
    public MyArrayIterator(ArrayList array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < array.size();
    }

    @Override
    public Object next() {
        lastReturned = nextIndex;
        previousIndex = nextIndex;
        nextIndex++;
        return array.get(lastReturned);
    }

    @Override
    public boolean hasPrevious() {
        return previousIndex >= 0 && previousIndex < array.size();
    }

    @Override
    public Object previous() {
        lastReturned = previousIndex;
        nextIndex = previousIndex;
        previousIndex--;
        return array.get(lastReturned);
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
        array.remove(lastReturned);
    }

    @Override
    public void set(Object e) {
        array.add(lastReturned, e);
    }

    @Override
    public void add(Object e) {
        array.add(e);
    }
    
}
    