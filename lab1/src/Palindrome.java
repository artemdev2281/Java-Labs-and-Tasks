public class Palindrome {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            if (isPalindrome(s)){
                System.out.println(s + " is palindrome");
            } else{
                System.out.println(s + " is not palindrome");
            }
        }
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
