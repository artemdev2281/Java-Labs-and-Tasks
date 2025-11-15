import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts = scan.nextLine().split(",");
        String first = parts[0].trim();
        String second = parts[1].trim();
        System.out.println(isAnagram(first, second));
        scan.close();
    }
    public static boolean isAnagram(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        char[] firstLetters = new char[first.length()];
        for (int i = 0; i < first.length(); i++) {
            firstLetters[i] = first.charAt(i);
        }
        Arrays.sort(firstLetters);

        char[] secondLetters = new char[second.length()];
        for (int i = 0; i < second.length(); i++) {
            secondLetters[i] = second.charAt(i);
        }
        Arrays.sort(secondLetters);

        return Arrays.equals(firstLetters, secondLetters);
    }
}
