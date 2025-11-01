import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();

        String[] parts = line.split("\\],");
        
        int[] arr1 = parseArray(parts[0]);
        int[] arr2 = parseArray(parts[1]);

        System.out.println(formatList(mergeUniqueSorted(arr1, arr2)));
    }

    public static int[] parseArray(String s) {
        s = s.replace("[", "").replace("]", "").trim();
        if (s.isEmpty()) return new int[0];
        String[] nums = s.split(",");
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i].trim());
        }
        return arr;
    }
    public static String formatList(List<Integer> list) {
    StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static List<Integer> mergeUniqueSorted(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int x : a) set.add(x);
        for (int y : b) set.add(y);
        List<Integer> res = new ArrayList<>(set);
        res.sort(Comparator.naturalOrder());
        return res;
    }
}
