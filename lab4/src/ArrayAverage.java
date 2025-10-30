public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3", "4", "5"};
        String[] arr2 = {"1", "2", "x", "4", "5"};
        System.out.println("Test 1");
        testArray(arr1, false);
        System.out.println("Test 2");
        testArray(arr2, false);
        System.out.println("Test 3");
        testArray(arr1, true);
    }
    public static void testArray (String[] arr, boolean goOutOfBound) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            if (goOutOfBound) {
                System.out.println(arr[arr.length]);
            }
            System.out.println("Среднее значение: " + (sum / arr.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: элемент массива не является числом");
        } finally {
            System.out.println("Тест завершен\n");
        }
    }
}
