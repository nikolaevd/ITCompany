
package itcompany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ITCompany {
    
    private Set employees = new HashSet();
    
    public static void main(String[] args){
        // создаем сотрудников
        Employee e1 = new Employee("Сергей Матвеев");
        Employee e2 = new Employee("Георгий Ревазов");
        
        // добавляем сотрудников в компанию
        ITCompany itcompany = new ITCompany();
        itcompany.employees.add(e1);
        itcompany.employees.add(e2);
        
        // создаем заказчиков
        Customer c1 = new Customer("Сбербанк");
        
        // создаем руководителей
        Manager m1 = new Manager("Павел Дуров");
        
        // создаем отдел и добавляем в него сотрудников
        Department development = new Department("Отдел разработки");
        development.addEmployee(e1);
        development.addEmployee(e2);
        
        // создаем проект и добавляем в него сотрудников
        Project autopayments = new Project("Автоплатежи", c1, m1);
        autopayments.addEmployee(e1);
        autopayments.addEmployee(e2);       
    }
    
    // получить список сотрудников, работающих над заданным проектом
    public Set getEmployeesByProject(Project project){
        return project.getEmployees();
    }
    
    // получить список проектов, в которых учавствует заданный сотрудник
    public Set getProjectsByEmployee(Employee employee){
        return employee.getProjects();
    }
    
    // получить список сотрудников из заданного отдела, не учваствующих ни в одном проекте
    public Set getEmployeesWithoutProjectsByDepartment(Department department){
        Set list = new HashSet();
        
        Iterator iterator = department.getEmployees().iterator();
        while(iterator.hasNext()){
            if(((Employee)iterator).getProjects() == null){
                list.add((Employee)iterator);
            }
        }
        
        return list;
    }
    
    // !!!!!!!!!!!
    // получить список сотрудников, не учавствующих ни в одном проекте
    public Set getEmployeesWithoutProjects(){
        Set list = new HashSet();
        
        Iterator iterator = employees.iterator();
        while(iterator.hasNext()){
            if(((Employee)iterator).getProjects() == null){
                list.add((Employee)iterator);
            }
        }
        
        return list;
    }
    
    // получить список подчиненных для заданного руководителя
    public Set getEmployeesByManager(Manager manager){
        Set list = new HashSet();
        
        Iterator iterator = manager.getProjects().iterator();
        while(iterator.hasNext()){
            list.add(((Project)iterator).getEmployees());
        }
        
        return list;
        
    }
    
    // получить список руководителей для заданного сотрудника
    public Set getManagersByEmployee(Employee employee){
        Set list = new HashSet();
        
        Iterator iterator = employee.getProjects().iterator();
        while(iterator.hasNext()){
            list.add(((Project)iterator).getManager());
        }
        
        return list;
    }
    
    // получить список сотрудников, учавствующих в тех же проектах, что и заданный сотрудник
    public Set getEmployeesByProjectsByEmployee(Employee employee){
        Set list = new HashSet();
        
        Iterator iterator = employee.getProjects().iterator();
        while(iterator.hasNext()){
            list.add(((Project)iterator).getEmployees());
        }
        
        return list;
    }
    
    // получить список проектов, выполненных для заданного заказчика
    public Set getProjectsByCustomer(Customer customer){
        Set list = new HashSet();
        
        Iterator iterator = customer.getProjects().iterator();
        while(iterator.hasNext()){
            list.add(((Project)iterator));
        }
        
        return list;
    }
    
    // получить список сотрудников, учавствующих в проектах
    public Set getEmployeesInvolvedInProjects(){
        Set list = new HashSet();
        
        Iterator iterator = employees.iterator();
        while(iterator.hasNext()){
            if(((Employee)iterator).getProjects() != null){
                list.add((Employee)iterator);
            }
        }
        
        return list;
    }

}
