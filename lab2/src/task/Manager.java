package task;

import task.interfaces.Workable;

public class Manager extends Employee implements Workable{

    private int teamSize;
    private String project;
    private String department;

    public Manager(){
        super();
        this.teamSize = 0;
        this.project = "unknown";
        this.department = "general";
    }

    public Manager(String name, int age, double salary, int teamSize, String project, String department){
        super(name, age, salary);
        this.teamSize = teamSize;
        this.project = project;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляет проектом: " + project);;
    }
    
    @Override
    public void doWork() {
        System.out.println(getName() + " проводит встречи и распределяет задачи (размер команды: " + teamSize + " человек)");
    }

    public int getTeamSize(){
        return teamSize;
    }
    public void setTeamSize(int teamSize){
        this.teamSize = teamSize;
    }

    public String getProject(){
        return project;
    }
    public void setProject(String project){
        this.project = project;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Департамент: " + department + ", Проект: " + project + ", Размер команды: " + teamSize);
    }
}
