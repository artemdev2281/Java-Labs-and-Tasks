import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(isPrime(number));
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        } 
        return true;
    }
}
