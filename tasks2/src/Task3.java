import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        List<Integer> input = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(",");
        for (int i = 0; i < parts.length; i++) {
            input.add(Integer.parseInt(parts[i].trim()));
        }
        System.out.println(sumOfPositives(input));
        scan.close();
    }
    public static int sumOfPositives(List<Integer> input){
        int res = 0;
        for (Integer number : input) {
            if (number >= 0) {
                res += number;
            }
        }
        return res;
    }
}
