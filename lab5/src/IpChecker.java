import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ip = scan.nextLine();
        System.out.println(ipCheck(ip));
        scan.close();
    }
    public static boolean ipCheck(String ip) {
        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$");
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }
}
