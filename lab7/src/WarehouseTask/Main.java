package WarehouseTask;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product(30),
            new Product(20),
            new Product(55), 
            new Product(40),
            new Product(10),
            new Product(25),
            new Product(70), 
            new Product(15),
            new Product(35)
        );

        Warehouse warehouse = new Warehouse(products);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        LoaderRealization loader1 = new LoaderRealization(warehouse, "Грузчик Василий");
        LoaderRealization loader2 = new LoaderRealization(warehouse, "Грузчик Геннадий");
        LoaderRealization loader3 = new LoaderRealization(warehouse, "Грузчик Тихомир");

        executor.execute(loader1);
        executor.execute(loader2);
        executor.execute(loader3);

        executor.shutdown();

    }
}
