import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println(checkAge(age));
    }
    public static String checkAge(int age){
        if (age >= 18) return "совершеннолетний";
        return "несовершеннолетний";
    }
}
