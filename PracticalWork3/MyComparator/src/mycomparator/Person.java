
package mycomparator;

class Person{
   
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    
    public Person(String lastName, String firstName, String patronymic){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getPatronymic(){
        return this.patronymic;
    }
    
}
