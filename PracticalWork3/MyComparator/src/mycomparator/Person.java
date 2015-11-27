
package mycomparator;

class Person implements Comparable<Person>{
   
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    
    public Person(String lastName, String firstName, String patronymic){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public int compareTo(Person p) {    
        // для измения порядка сортировки поменять местами логические блоки метода
        // например: для по отчеству, затем по фамилии, затем по имени
        // поставить блок сортировки по отчеству на 1-е место, следом сортировка
        // по фамилии, затем по имени
        
        int result = 0;
        
        // упорядочивание по имени
        result = this.firstName.compareTo(p.firstName);
        if(result != 0){
            return result;
        }
        
        // упорядочивание по фамилии
        result = this.lastName.compareTo(p.lastName);
        if(result != 0){
            return result;
        }
        
        // упорядочивание по отчеству
        result = this.patronymic.compareTo(p.patronymic);
        if(result != 0){
            return result;
        }
        
        return result;
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
