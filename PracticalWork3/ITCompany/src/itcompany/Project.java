
package itcompany;

public class Project {
    
    private String name;
    private Manager manager;
    private Customer customer;
    private boolean isDone;
    
    public Project(String name, Manager manager, Customer customer){
        this.name = name;
        this.manager = manager;
        this.customer = customer;
    }
    
    public void setIsDone(boolean done){
        isDone = done;
    }
    
    public boolean getIsDone(){
        return isDone;
    }
    
    public String getProjectName(){
        return name;
    }
    
}
