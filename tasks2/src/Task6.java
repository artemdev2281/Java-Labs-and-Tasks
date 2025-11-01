import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(",");
        int value = Integer.parseInt(parts[0].trim());
        int min = Integer.parseInt(parts[1].trim());
        int max = Integer.parseInt(parts[2].trim());
        System.out.println(clamp(value, min, max));
        scan.close();
    }
    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    }
}
