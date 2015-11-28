
package mylistiterator;

import java.util.ListIterator;

public class MyStringIterator implements ListIterator<String>{
    
    private String str;
    private int previousIndex = -1;
    private int nextIndex = 0;
    
    public  MyStringIterator(String str){
        this.str = str;
    }

    @Override
    public boolean hasNext() {
        if(nextIndex < str.length()) return true;
        return false;
    }

    @Override
    public String next() {
        return str.substring(nextIndex, nextIndex+1);
    }

    @Override
    public boolean hasPrevious() {
        if(previousIndex < str.length() && previousIndex >= 0) return true;
        return false;
    }

    @Override
    public String previous() {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
