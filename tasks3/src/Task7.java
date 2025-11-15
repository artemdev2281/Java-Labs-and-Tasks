import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        System.out.println(countWords(input));
    }
    public static int countWords(String input) {
        String[] words = input.trim().split("\\s+");
        return words.length;
    }
}
