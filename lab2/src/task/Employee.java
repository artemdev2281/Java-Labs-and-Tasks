package task;

public abstract class Employee {

    private String name;
    private int age;
    private double salary;
    private static int count = 0;

    public Employee(){
        this("noname", 0, 0.0);
    }

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        count++;
    }

    public abstract void work();

    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Зарплата: " + salary);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

}
