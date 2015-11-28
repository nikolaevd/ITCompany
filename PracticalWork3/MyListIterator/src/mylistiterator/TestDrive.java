
package mylistiterator;

public class TestDrive {
    
    public static void main(String[] args) {
        
        MyStringIterator stringIterator = new MyStringIterator("Здравствуй новая строка!");
        while(stringIterator.hasNext()){
            String s = stringIterator.next();
            System.out.println(s);
        }
    }
    
}
