
package itcompany;

public class Project {
    
    private Manager manager;
    private Customer customer;
    private boolean isDone;
    
    public Project(Manager manager, Customer customer){
        this.manager = manager;
        this.customer = customer;
    }
    
    public void setIsDone(boolean done){
        isDone = done;
    }
    
    public boolean getIsDone(){
        return isDone;
    }
    
}
