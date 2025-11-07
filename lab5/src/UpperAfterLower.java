import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperAfterLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(upperAfterLower(text));
        scan.close();
    }
    public static String upperAfterLower(String text) {
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        String res = matcher.replaceAll("!$0!");

        return res;
    }
}
