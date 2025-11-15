import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(reverseWords(input));
        scan.close();
    }
    public static String reverseWords(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }
        return result.toString();
    }
}
