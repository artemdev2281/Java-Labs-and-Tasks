package task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean create = true;

        while (create) {
            System.out.println("Введите тип работника (Programmer, Manager, Administrator): ");
            String choose = scan.next();
            if (!(choose.equalsIgnoreCase("Programmer") || choose.equalsIgnoreCase("Manager") || choose.equalsIgnoreCase("Administrator"))){
                System.out.println("Ошибка: Введен неправильный тип работника. Повторите ввод.");
                continue;
            }
                System.out.print("Введите имя: ");
                String name = scan.next();

                System.out.print("Введите возраст: ");
                int age = scan.nextInt();

                System.out.print("Введите ЗП: ");
                double salary = scan.nextDouble();

                if (choose.equalsIgnoreCase("Programmer")) {
                System.out.print("Введите язык программирования: ");
                String language = scan.next();

                System.out.print("Введите опыт работы (лет): ");
                int experience = scan.nextInt();

                System.out.print("Работает удаленно (true/false): ");
                boolean remote = scan.nextBoolean();

                Programmer p = new Programmer(name, age, salary, language, experience, remote);
                System.out.println("\n--- Создан Программист ---");
                p.printInfo();
                p.work();
                p.doWork();

                } else if (choose.equalsIgnoreCase("Manager")) { 
                System.out.print("Введите размер команды: ");
                int teamSize = scan.nextInt();

                System.out.print("Введите название проекта: ");
                String project = scan.next();

                System.out.print("Введите название департамента: ");
                String department = scan.next();

                Manager m = new Manager(name, age, salary, teamSize, project, department);
                System.out.println("\n--- Создан Менеджер ---");
                m.printInfo();
                m.work();
                m.doWork();

                } else {
                System.out.print("Введите размер команды: ");
                int teamSize = scan.nextInt();

                System.out.print("Введите название проекта: ");
                String project = scan.next();

                System.out.print("Введите название департамента: ");
                String department = scan.next();

                System.out.print("Администрируемая система: ");
                String system = scan.next();

                System.out.print("Имеет root-доступ (true/false): ");
                boolean hasRootAccess = scan.nextBoolean();

                System.out.print("Смена (day/night): ");
                String shift = scan.next();

                Administrator a = new Administrator(name, age, salary, teamSize, project, department, system, hasRootAccess, shift);
                System.out.println("\n--- Создан Администратор ---");
                a.printInfo();
                a.work();
                a.doWork();
                }

                System.out.println("\nХотите создать нового сотрудника? (yes/no): ");
                String answer = scan.next();
                if (answer.equalsIgnoreCase("no")){
                    create = false;
                }
        }
        System.out.println("\nВсего сотрудников создано: " + Employee.getCount());
        scan.close();
    }
}
