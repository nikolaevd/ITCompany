
package itcompany;

import java.util.HashSet;
import java.util.Set;

public class Man {
    
    private final String name;
    private final Set projects;
    
    public Man(String name){
        this.name = name;
        this.projects = new HashSet();
    }
    
    public String getName() {
        return name;
    }
    
    public void addProjects(Project newProject){
        projects.add(newProject);
    }
    
    public Set getProjects(){
        return projects;
    }
    
    public void removeProject(Project project){
        projects.remove(project);
    }
    
}
