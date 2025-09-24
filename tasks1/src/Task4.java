import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(isEven(number));
    }
    public static boolean isEven(int number){
        if (number % 2 == 0) return true;
        return false;
    } 
}
