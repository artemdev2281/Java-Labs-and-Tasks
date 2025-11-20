import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MatrixMaxExecutor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[][] matrix = {
            {2, 2, 8},
            {3, 3, 7},
            {6, 6, 6},
            {1, 4, 8},
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        List<Future<Integer>> results = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            final int rowIndex = i;
            Future<Integer> f = executor.submit(() -> {
                int max = matrix[rowIndex][0];
                for (int value : matrix[rowIndex]) {
                    if (value > max) max = value;
                }
                return max;
            });
            results.add(f);
        }

        int globalMax = Integer.MIN_VALUE;

        for (Future<Integer> f : results) {
            int rowMax = f.get();
            if (rowMax > globalMax) globalMax = rowMax;
        }

        executor.shutdown();

        System.out.println(globalMax);
    }
}
