package task;

public class Administrator extends Manager {
    
    private String system;
    private boolean hasRootAccess;
    private String shift;

    public Administrator(){
        super();
        this.system = "unknown";
        this.hasRootAccess = false;
        this.shift = "day";
    }

    public Administrator(String name, int age, double salary, int teamSize, String project, String department, String system, boolean hasRootAccess, String shift){
        super(name, age, salary, teamSize, project, department);
        this.system = system;
        this.hasRootAccess = hasRootAccess;
        this.shift = shift;
    }

    @Override
    public void work() {
        System.out.println(getName() + " администрирует систему: " + system);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + (hasRootAccess ? " имеет root-доступ и выполняет задачи админа" : " не имеет root-доступ"));
    }

    public String getSystem(){
        return system;
    }
    public void setSystem(String system){
        this.system = system;
    }

    public boolean isHasRootAccess(){
        return hasRootAccess;
    }
    public void setHasRootAccess(boolean hasRootAccess){
        this.hasRootAccess = hasRootAccess;
    }

    public String getShift(){
        return shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Система: " + system + ", Root: " + hasRootAccess + ", Смена: " + shift);
    } 
}
