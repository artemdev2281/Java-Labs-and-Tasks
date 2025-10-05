package task;

import task.interfaces.Workable;

public class Programmer extends Employee implements Workable{
    
    private String language;
    private int experience;
    private boolean remote;

    public Programmer(){
        super();
        this.language = "unknown";
        this.experience = 0;
        this.remote = false;
    }

    public Programmer(String name, int age, double salary, String language, int experience, boolean remote){
        super(name, age, salary);
        this.language = language;
        this.experience = experience;
        this.remote = remote;
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет на " + language);
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " пишет код (" + experience + " лет опыта)");
    }

    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language = language;
    }

    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }

    public boolean isRemote(){
        return remote;
    }
    public void setRemote(boolean remote){
        this.remote = remote;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Язык: " + language + ", Опыт: " + experience + " лет, Удалённо: " + remote);
    }
}
