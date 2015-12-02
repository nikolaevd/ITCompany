
package itcompany;

import java.util.HashSet;
import java.util.Set;

public class Project {
    
    private final String name;
    private final Set men;
    private boolean isFinished;
    
    public Project(String name){
        this.name = name;
        men = new HashSet();
    }
    
    public String getName(){
        return name;
    }
    
    public void setProjectStatus(boolean finish){
        isFinished = finish;
    }
    
    public boolean getProjectStatus(){
        return isFinished;
    }
    
    public void addMan(Man newMan){
        men.add(newMan);
        newMan.addProject(this);
    }
    
    public Set getMen(){
        return men;
    }
    
    public void removeMan(Man man){
        men.remove(man);
    }
    
}
