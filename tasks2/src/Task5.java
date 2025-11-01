import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(",");
        List<Integer> arr = new ArrayList<>();
        
        int i = 0;
        while (line.charAt(i) != ']') {
            if (line.charAt(i) != '[' && line.charAt(i) != ',' && line.charAt(i) != ' ') {
                arr.add(Integer.parseInt(String.valueOf(line.charAt(i))));
            }
            i++;
        }
        int k = Integer.parseInt(parts[parts.length - 1].trim());
        scan.close();
        System.out.println(rotateRight(arr, k));
    }
    public static List<Integer> rotateRight(List<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return arr;
        }

        k = k % arr.size();
        if (k == 0) {
            return arr;
        }

        List<Integer> result = new ArrayList<>();

        result.addAll(arr.subList(arr.size() - k, arr.size()));
        result.addAll(arr.subList(0, arr.size()-k));
        return result;
    }
}
