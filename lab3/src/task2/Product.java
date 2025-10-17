package task2;

public class Product {
    private String name;
    private String description;
    private int price;
    private int count;

    public Product(){
        this("none", "none", 0, 0);
    }

    public Product(String name, String description, int price, int count){
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    @Override
    public String toString() {
        return name + " (" + description + "), " + price + ", " + count + " шт.";
    }
}
