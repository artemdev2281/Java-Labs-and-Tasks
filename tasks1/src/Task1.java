import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(toFahrenheit(input));
    }
    public static int toFahrenheit(int c){
        return c * 9/5 + 32;
    }
}