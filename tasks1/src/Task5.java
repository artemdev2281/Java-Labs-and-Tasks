import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(daysToWeeks(number));;
    }
    public static String daysToWeeks(int number){
        int weeks = number / 7;
        int days = number % 7;
        return weeks + " " + getWeekForm(weeks) + " и " + days + " " + getDayForm(days);
    }
    public static String getWeekForm(int number){
        if (number % 10 == 1 && number % 100 != 11){
            return "неделя";
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            return "недели";
        } else {
            return "недель";
        }
    }
    public static String getDayForm(int number){
        if (number % 10 == 1 && number % 100 != 11){
            return "день";
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            return "дня";
        } else {
            return "дней";
        }
    }
}
