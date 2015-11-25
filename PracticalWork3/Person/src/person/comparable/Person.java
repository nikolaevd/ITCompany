
package person.comparable;

import java.util.TreeSet;

class Person implements Comparable<Person>{
   
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    
    public Person(String lastName, String firstName, String patronymic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    @Override
    public int compareTo(Person p) {
        // для измения порядка сортировки поменять местами логические блоки метода
        // например: для по отчеству, затем по фамилии, затем по имени
        // поставить блок сортировки по отчеству на 1-е место, следом сортировка
        // по фамилии, затем по имени
        
        // упорядочивание по имени
        int result = this.firstName.compareTo(p.firstName);
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
        
        return 0;
    }
    
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("Лавров", "Сергей", "Викторович"));
        tree.add(new Person("Анохин", "Сергей", "Валерьевич"));
        tree.add(new Person("Кривенко", "Максим", "Леонидович"));
        tree.add(new Person("Тихонов", "Алексей", "Дмитриевич"));
        tree.add(new Person("Прокопенко", "Владимир", "Алексеевич"));
        
        for(Person p : tree){
            System.out.println(p.lastName + " " + p.firstName + " " + p.patronymic);
        }
    }
    
}
