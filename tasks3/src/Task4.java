import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        System.out.println(sumOfDigits(input));
    }
    public static int sumOfDigits(int input) {
        int result = 0;
        while (input > 0) {
            result += input % 10;
            input /= 10;
        }
        return result;
    }
}
