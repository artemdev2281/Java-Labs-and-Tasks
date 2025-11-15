import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        System.out.println(countVowels(input));
    }
    public static int countVowels(String input) {
        input = input.toLowerCase();
        String vowels = input.replaceAll("[^aeiou]", "");
        return vowels.length();
    }
}
