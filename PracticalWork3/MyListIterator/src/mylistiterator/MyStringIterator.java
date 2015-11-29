
package mylistiterator;

import java.util.ListIterator;

public class MyStringIterator implements ListIterator<String>{
    
    private String str;
    private int previousIndex = -1;
    private int nextIndex = 0;
    private int lastReturned = 0;
    
    public  MyStringIterator(String str){
        this.str = str;
    }

    @Override
    public boolean hasNext() {
        if(nextIndex < str.length()) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        lastReturned = nextIndex;
        previousIndex = nextIndex;
        nextIndex++;
        return str.substring(previousIndex, nextIndex);
    }

    @Override
    public boolean hasPrevious() {
        if(previousIndex >= 0 && previousIndex < str.length()) {
            
            return true;
        }
        return false;
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
        // удалить последний возрвращенный элемент
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(String e) {
        // установить элемент на позицию последнего возращенного элемента новый символ
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(String e) {
        // установить элемент на позцицию непосредственно перед последним возвращенным символов
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
