import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println(season(month));
    }
    public static String season(int month){
        if (month <= 2 || month == 12){
            return "зима";
        } else if (month <= 5){
            return "весна";
        } else if (month <= 8){
            return "лето";
        } else{
            return "осень";
        }
    }
}
