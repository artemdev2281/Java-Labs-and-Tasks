package WarehouseTask;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Product> products = new ArrayList<>();
    private int currentBatchWeight = 0;

    public Warehouse(List<Product> initialProducts) {
        products.addAll(initialProducts);
    }

    public synchronized Product getNextProduct() {
        if (products.isEmpty()) return null;
        return products.remove(products.size() - 1);
    }

    public synchronized void addToBatch(int weight, String loaderName) {
        currentBatchWeight += weight;
        System.out.println(loaderName + " взял товар " + weight + " кг. Партия: " + currentBatchWeight + "/150");

        if (currentBatchWeight >= 150) {
            System.out.println("Партия собрана - грузчики отправляются на другой склад для разгрузки");
            currentBatchWeight = 0;
        }
    }

    public synchronized void finalUnload() {
        System.out.println("Последняя разгрузка");
        currentBatchWeight = 0;
    }
}
