package task2;

public class Main {
    public static void main(String[] args) {
        // Создаём объект хэш-таблицы товаров
        HashMapProducts store = new HashMapProducts();

        System.out.println("=== ДОБАВЛЕНИЕ НОВЫХ ТОВАРОВ (putProduct) ===");
        store.putProduct("A001", new Product("Телефон", "Samsung Galaxy", 30000, 5));
        store.putProduct("A002", new Product("Ноутбук", "ASUS VivoBook", 70000, 3));
        store.putProduct("A003", new Product("Планшет", "Apple iPad", 50000, 2));

        store.printAllProducts();

        System.out.println("\n=== ДОБАВЛЕНИЕ ТАКОГО ЖЕ ТОВАРА (addProduct) ===");
        store.addProduct("A001", new Product("Телефон", "Samsung Galaxy", 30000, 2)); // добавляем те же телефоны
        System.out.println("После добавления товара с тем же артикулом:");
        store.printAllProducts();

        System.out.println("\n=== ЗАМЕНА ТОВАРА ПО АРТИКУЛУ (putProduct) ===");
        store.putProduct("A002", new Product("Монитор", "Samsung 27\"", 25000, 4)); // заменяем ноутбук на монитор
        store.printAllProducts();

        System.out.println("\n=== УСТАНОВКА НОВОГО КОЛИЧЕСТВА (setProductCount) ===");
        store.setProductCount("A001", 10); // задаём точное количество для телефонов
        store.printAllProducts();

        System.out.println("\n=== ПОИСК И УДАЛЕНИЕ ===");
        System.out.println("Поиск A003: " + store.getProduct("A003"));
        store.removeProduct("A003");
        System.out.println("После удаления планшета:");
        store.printAllProducts();

        System.out.println("\nВсего товаров в таблице: " + store.size());
        System.out.println("Таблица пуста? " + store.isEmpty());
    }
}
