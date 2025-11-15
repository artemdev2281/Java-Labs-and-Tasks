import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        int a = Integer.parseInt(input[0].trim());
        int b = Integer.parseInt(input[1].trim());
        int c = Integer.parseInt(input[2].trim());
        scan.close();
        System.out.println(isTriangle(a, b, c));
    }
    public static boolean isTriangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        } return false;
    }
}
