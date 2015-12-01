
package itcompany;

import java.util.HashSet;
import java.util.Set;

public class Department {
    
    private final String name;
    private final Set employees;
    
    public Department(String name){
        this.name = name;
        employees = new HashSet();
    }
    
    public String getName(){
        return name;
    }
    
    public void addEmployee(Employee newEmployee){
        employees.add(newEmployee);
    }

    public Set getEmployees() {
        return employees;
    }
    
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
