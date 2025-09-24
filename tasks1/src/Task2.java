import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(rectangleArea(a, b));
    }
    public static double rectangleArea(double a, double b){
        return a * b;
    }
}
