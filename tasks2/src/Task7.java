import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(countEvenOddDigits(n)[0] + ", " + countEvenOddDigits(n)[1]);
        scan.close();
    }
    public static int[] countEvenOddDigits(int n) {
        int countEven = 0;
        int countNotEven = 0;
        int[] zeroCase = {1, 0};

        if (n == 0) {
            return zeroCase;
        }

        while (n != 0) {
            if ((n % 10) % 2 == 0) {
                countEven += 1;
            } else {
                countNotEven += 1;
            }
            n /= 10;
        }

        int[] res = new int[2];
        res[0] = countEven;
        res[1] = countNotEven;
        return res;
    }
}
