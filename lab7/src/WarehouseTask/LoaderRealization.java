package WarehouseTask;

public class LoaderRealization implements Runnable {
    private final Warehouse warehouse;
    private final String name;

    public LoaderRealization(Warehouse warehouse, String name) {
        this.warehouse = warehouse;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            Product product = warehouse.getNextProduct();

            if (product == null) {
                System.out.println(name + ": Товары на складе закончились");
                warehouse.finalUnload();
                break;
            }

            warehouse.addToBatch(product.getWeight(), name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {}
        }
    }
}
