
package mycomparator;

import java.util.TreeSet;

public class TestDrive {
    public static void main(String[] args) {
        System.out.println("Сортировка по имени: ");
        System.out.println();
        
        TreeSet<Person> tree1 = new TreeSet<>(new SortByFirstName());
        tree1.add(new Person("Лавров", "Сергей", "Викторович"));
        tree1.add(new Person("Анохин", "Сергей", "Валерьевич"));
        tree1.add(new Person("Кривенко", "Максим", "Леонидович"));
        tree1.add(new Person("Тихонов", "Алексей", "Дмитриевич"));
        tree1.add(new Person("Прокопенко", "Владимир", "Алексеевич"));
        tree1.add(new Person("Мавроди", "Сергей", "Пантелеевич"));
        
        for(Person p : tree1){
            System.out.println(p.getLastName() + " " + p.getFirstName() + " " + p.getPatronymic());
        }
        
        System.out.println();
        System.out.println("Сортировка по фамилии: ");
        System.out.println();
        
        TreeSet<Person> tree2 = new TreeSet<>(new SortByLastName());
        tree2.add(new Person("Лавров", "Сергей", "Викторович"));
        tree2.add(new Person("Анохин", "Сергей", "Валерьевич"));
        tree2.add(new Person("Кривенко", "Максим", "Леонидович"));
        tree2.add(new Person("Тихонов", "Алексей", "Дмитриевич"));
        tree2.add(new Person("Прокопенко", "Владимир", "Алексеевич"));
        tree2.add(new Person("Мавроди", "Сергей", "Пантелеевич"));
        
        for(Person p : tree2){
            System.out.println(p.getLastName() + " " + p.getFirstName() + " " + p.getPatronymic());
        }
        
        System.out.println();
        System.out.println("Сортировка по отчеству: ");
        System.out.println();
        
        TreeSet<Person> tree3 = new TreeSet<>(new SortByPatronymic());
        tree3.add(new Person("Лавров", "Сергей", "Викторович"));
        tree3.add(new Person("Анохин", "Сергей", "Валерьевич"));
        tree3.add(new Person("Кривенко", "Максим", "Леонидович"));
        tree3.add(new Person("Тихонов", "Алексей", "Дмитриевич"));
        tree3.add(new Person("Прокопенко", "Владимир", "Алексеевич"));
        tree3.add(new Person("Мавроди", "Сергей", "Пантелеевич"));
        
        for(Person p : tree3){
            System.out.println(p.getLastName() + " " + p.getFirstName() + " " + p.getPatronymic());
        }
    } 
}
