
package itcompany;

import java.util.ArrayList;

public class Employee {
    
    private String name;
    private Departament departament;
    private ArrayList<Project> projectList = new ArrayList<>();
    
    public Employee(String name, Departament departament){
        this.name = name;
        this.departament = departament;
    }
    
    public void setProject(Project project){
        projectList.add(project);
    }
    
    public String getName(){
        return name;
    }
    
    public Departament getDepartament(){
        return departament;
    }
    
    public ArrayList<Project> getProjectList(){
        return projectList;
    }
}
