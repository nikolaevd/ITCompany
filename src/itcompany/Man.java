
package itcompany;

import java.util.HashSet;
import java.util.Set;

public class Man {
    
    private String name;
    private Set projects;
    
    public Man(String name){
        this.name = name;
        this.projects = new HashSet();
    }
    
    public String getName() {
        return name;
    }
    
    public void addProject(Project newProject){
        projects.add(newProject);
        newProject.addEmployee(this);
    }
    
    public Set getProjects(){
        return projects;
    }
    
    public void removeProject(Project project){
        projects.remove(project);
    }
    
}
