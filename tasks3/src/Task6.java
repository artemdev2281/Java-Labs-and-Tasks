import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
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
        System.out.println(filterEven(numbers));
    }
    public static List<Integer> filterEven(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
