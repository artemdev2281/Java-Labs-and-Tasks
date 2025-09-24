import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(digitSum(number));
    }
    public static int digitSum(int number){
        int result = 0;
        String s = Integer.toString(number);
        for (int i = 0; i < s.length(); i++){
            result += Character.getNumericValue(s.charAt(i));
        }
        return result;
    }
}
