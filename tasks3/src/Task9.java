import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replaceAll("[\\[\\]]", "");
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        scan.close();
        System.out.println(differenceMaxMin(numbers));
    }
    public static int differenceMaxMin(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0];
    }
}
