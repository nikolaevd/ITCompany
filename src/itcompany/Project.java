
package itcompany;

import java.util.HashSet;
import java.util.Set;

public class Project {
    
    private String name;
    private Customer customer;
    private Manager manager;
    private Set employees;
    private boolean isFinished;
    
    public Project(String name, Customer customer, Manager manager){
        this.name = name;
        this.customer = customer;
        this.manager = manager;
        employees = new HashSet();
    }
    
    public String getName(){
        return name;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public Manager getManager(){
        return manager;
    }
    
    public void setProjectStatus(boolean finish){
        isFinished = finish;
    }
    
    public boolean getProjectStatus(){
        return isFinished;
    }
    
    public void addEmployee(Man newEmployee){
        employees.add(newEmployee);
        newEmployee.addProject(this);
    }
    
    public Set getEmployees(){
        return employees;
    }
    
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    
}
