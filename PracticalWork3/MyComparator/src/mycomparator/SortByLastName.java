
package mycomparator;

import java.util.Comparator;

public class SortByLastName implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        
        int result = 0;
        
        // упорядочивание по фамилии
        result = p1.getLastName().compareTo(p2.getLastName());
        if(result != 0){
            return result;
        }
        
        // упорядочивание по имени
        result = p1.getFirstName().compareTo(p2.getFirstName());
        if(result != 0){
            return result;
        }
        
        // упорядочивание по отчеству
        result = p1.getPatronymic().compareTo(p2.getPatronymic());
        if(result != 0){
            return result;
        }

        return result;
    }
    
}
