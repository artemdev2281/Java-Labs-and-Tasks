import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(average(a, b, c));
    }
    public static int average(int a, int b, int c){
        return (a + b + c) / 3;
    }
}
