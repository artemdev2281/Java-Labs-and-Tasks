import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.print("Введите букву: ");
        String letter = scan.nextLine().toLowerCase();
        System.out.println(wordFinder(text, letter));
        scan.close();
    }
    public static List<String> wordFinder(String text, String letter) {
        List<String> res = new ArrayList<>();

        if (text == null || text.isEmpty() || letter == null || letter.isEmpty()) {
            System.out.println("Ошибка ввода");
            return res;
        }

        Pattern pattern = Pattern.compile("\\b" + letter + "[a-zA-Z]*\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            res.add(matcher.group());
        }

        return res;
    }
}
