
package person;

public class Person implements Comparable<Person>{
    
    private String firstName;
    private String lastName;
    private String patronymic;
    
    public Person(String firstName, String lastName, String patronymic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public static void main(String[] args) {
        
    }

    @Override
    public int compareTo(Person o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
