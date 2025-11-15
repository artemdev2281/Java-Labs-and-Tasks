import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
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
        System.out.println(secondLargest(numbers));
    }
    public static int secondLargest(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }
}
