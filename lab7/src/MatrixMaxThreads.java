public class MatrixMaxThreads {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = {
            {2, 2, 8},
            {3, 3, 7},
            {6, 6, 6},
            {4, 8, 8}
        };

        int[] rowMax = new int[matrix.length];
        Thread[] threads = new Thread[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            final int rowIndex = i;
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    int max = matrix[rowIndex][0];
                    for (int value : matrix[rowIndex]) {
                        if (value > max) max = value;
                    }
                    rowMax[rowIndex] = max;
                }
            };
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        int globalMax = Integer.MIN_VALUE;
        for (int m : rowMax) {
            if (m > globalMax) globalMax = m;
        }

        System.out.println(globalMax);
        
    }
}
