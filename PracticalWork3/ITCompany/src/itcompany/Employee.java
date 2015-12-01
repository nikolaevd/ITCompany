
package itcompany;

public class Employee extends Man{
    
    Department department;
    
    public Employee(String name){
        super(name);
    }
    
    public void setDepartment(Department departmnet){
        this.department = departmnet;
    }
    
    public Department getDepartment(){
        return department;
    }
}
