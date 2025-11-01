import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(",");
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        System.out.println(sumRange(a, b));
        scan.close();
    }
    public static int sumRange(int a, int b){
        int res = 0;
        for (int i = a; i <= b; i++){
            res += i;
        }
        return res;
    }

}
