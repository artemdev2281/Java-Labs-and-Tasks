import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine().trim();
        scan.close();

        String row = line.substring(2, line.length() - 2);
        String[] rows = row.split("\\],\\[");

        int n = rows.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] nums = rows[i].split(",");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(nums[j].trim());
            }
        }
        System.out.println(diagonalSum(matrix));
        
    }

    public static int diagonalSum(int[][] matrix) {
        int res = 0;

        for (int i = 0; i < matrix.length; i++) {
            res += matrix[i][i];
        }

        return res;
    }
}
