import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
    public static void main(String[] args){
        List<String> input = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(",");
        for (int i = 0; i < parts.length; i++) {
            input.add(parts[i].trim());
        }
        System.out.println(hasDuplicates(input));
        scan.close();
    }
    public static boolean hasDuplicates(List<String> input){
        Set<String> check = new HashSet<>();
        for (String part : input) {
            if (!check.add(part)) {
                return true;
            }
        }
        return false;
    }
}
