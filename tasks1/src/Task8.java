import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(isPalindrome(s));
    }
    public static String reverseString(String s){
        String reverse = "";
        for (int index = s.length()- 1; index >= 0;index--){
            reverse += s.charAt(index);
        }
        return reverse;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    } 
}

