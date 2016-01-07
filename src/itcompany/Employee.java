
package itcompany;

public class Employee extends Man{
    
    Department department;
    
    public Employee(String name){
        super(name);
    }
    
    public void setDepartment(Department departmnet){
        this.department = departmnet;
        departmnet.addEmployee(this);
    }
    
    public Department getDepartment(){
        return department;
    }
}
