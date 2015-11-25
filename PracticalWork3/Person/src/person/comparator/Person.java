
package person.comparator;

import java.util.Comparator;

class Person implements Comparator<Person>{
   
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    
    public Person(String lastName, String firstName, String patronymic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }
 
    @Override
    public int compare(Person o1, Person o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        
    }
    
}
