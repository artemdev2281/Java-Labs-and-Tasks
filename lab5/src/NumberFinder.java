import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(findNumber(input));
        scan.close();
    }
    public static List<String> findNumber(String input){
        List<String> res = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            res.add(matcher.group());
        }
        return res;
    }
}
