
package mycomparator;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        // для измения порядка сортировки поменять местами логические блоки метода
        // например: для по отчеству, затем по фамилии, затем по имени
        // поставить блок сортировки по отчеству на 1-е место, следом сортировка
        // по фамилии, затем по имени
        
        int result = 0;
        
        // упорядочивание по имени
        result = p1.getFirstName().compareTo(p2.getFirstName());
        if(result != 0){
            return result;
        }
        
        // упорядочивание по фамилии
        result = p1.getLastName().compareTo(p2.getLastName());
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
    
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>(new MyComparator());
        tree.add(new Person("Лавров", "Сергей", "Викторович"));
        tree.add(new Person("Анохин", "Сергей", "Валерьевич"));
        tree.add(new Person("Кривенко", "Максим", "Леонидович"));
        tree.add(new Person("Тихонов", "Алексей", "Дмитриевич"));
        tree.add(new Person("Прокопенко", "Владимир", "Алексеевич"));
        tree.add(new Person("Мавроди", "Сергей", "Пантелеевич"));
        
        for(Person p : tree){
            System.out.println(p.getLastName() + " " + p.getFirstName() + " " + p.getPatronymic());
        }
    } 
    
}
