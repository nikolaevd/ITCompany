
package itcompany;

import java.util.ArrayList;

public class ITCompany {
    
    private ArrayList<Employee> employees;
    private ArrayList<Project> projects;

    public static void main(String[] args) {
        ITCompany company = new ITCompany();
        company.employees = new ArrayList<>();
        
        company.employees.add(new Employee("Петр Иванов", new Departament("Разаботка")));
        company.employees.add(new Employee("Сергей Донцов", new Departament("Разработка")));
        company.employees.add(new Employee("Марфа Дейцева", new Departament("Дизайн")));
        company.employees.add(new Employee("Юлия Пекарева", new Departament("Коммерческий отдел")));
        company.employees.add(new Employee("Антонина Арсеньева", new Departament("Коммерческий отдел")));
        
        company.InitializeProjects();
        
        company.employees.get(0).setProject(company.projects.get(0));
        company.employees.get(1).setProject(company.projects.get(1));       
        
        
    }
    
    // список сотрудников, работающих над заданным проектом
    public void getEmployeesByProject(Project project){
        System.out.println("В проекте " + project.getProjectName() + " учавствуют сотрудники: ");
        
        for(Employee e : employees){
            ArrayList<Project> projectList = e.getProjectList();
            for(Project p : projectList){
                if(project.getProjectName().equals(project.getProjectName())){
                    System.out.println(e.getName());
                }
            }
        }
    }
    
    // создаем проекты
    public void InitializeProjects(){
        projects = new ArrayList<>();
        projects.add(new Project("Автоплатежи", new Manager("Сергей Поздняков"), new Customer("АО Сбербанк")));
        projects.add(new Project("Спасибо от Сбербанка", new Manager("Тимур Вахабидзе"), new Customer("АО Сбербанк")));
    }
    
}
