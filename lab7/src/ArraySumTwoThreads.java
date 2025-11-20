public class ArraySumTwoThreads {
    public static void main(String[] args) throws InterruptedException {

        int len = Integer.parseInt(args[0]);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = i + 1;
        }

        int mid = len / 2;

        final int[] sum1 = {0};
        final int[] sum2 = {0};

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                int s = 0;
                for (int i = 0; i < mid; i++) {
                    s += arr[i];
                }
                sum1[0] = s;
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int s = 0;
                for (int i = mid; i < len; i++) {
                    s += arr[i];
                }
                sum2[0] = s;
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int res = sum1[0] + sum2[0];
        System.out.println(res);
    }
}
