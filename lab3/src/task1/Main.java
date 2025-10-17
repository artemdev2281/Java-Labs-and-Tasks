package task1;
public class Main {
    public static void main(String[] args){
        HashTable<String, Integer> table = new HashTable<>();

        table.put("apple", 5);
        table.put("banana", 3);
        table.put("pear", 8);

        System.out.println("Размер таблицы: " + table.size());
        System.out.println("Значение по ключу 'banana': " + table.get("banana"));

        table.put("apple", 10);
        System.out.println("Новое значение по ключу 'apple': " + table.get("apple"));

        table.remove("pear");
        System.out.println("После удаления 'pear' размер: " + table.size());

        System.out.println("Пуста ли таблица? " + table.isEmpty());

        System.out.println("Значение по ключу 'orange': " + table.get("orange"));
    }
}