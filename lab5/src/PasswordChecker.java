import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        System.out.println(passwordCheck(input));
    }
    public static boolean passwordCheck(String password) {

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
