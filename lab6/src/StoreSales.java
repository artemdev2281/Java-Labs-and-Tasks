import java.util.HashMap;
import java.util.Map;

public class StoreSales {

    private Map<String, Integer> sales = new HashMap<>();

    public void addSale(String product) {
        sales.put(product, sales.getOrDefault(product, 0) + 1);
    }

    public void printSales() {
        if (sales.isEmpty()) {
            System.out.println("Продаж пока нет.");
            return;
        }

        System.out.println("Список проданных товаров:");
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public int getTotalSales() {
        int sum = 0;
        for (int count : sales.values()) {
            sum += count;
        }
        return sum;
    }

    public String getMostPopularProduct() {
        if (sales.isEmpty())
            return null;

        String popular = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                popular = entry.getKey();
            }
        }

        return popular;
    }

    public static void main(String[] args) {
        StoreSales store = new StoreSales();

        store.addSale("Хлеб");
        store.addSale("Хлеб");
        store.addSale("Молоко");
        store.addSale("Яблоки");
        store.addSale("Хлеб");
        store.addSale("Молоко");

        store.printSales();

        System.out.println("\nОбщее количество продаж: " + store.getTotalSales());

        String popular = store.getMostPopularProduct();
        System.out.println("Самый популярный товар: " + popular);
    }
}
