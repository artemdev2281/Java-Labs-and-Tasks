package task2;
import java.util.HashMap;
import java.util.Map;

public class HashMapProducts {
    private Map<String, Product> productMap;

    public HashMapProducts() {
        productMap = new HashMap<>();
    }

    public void addProduct(String article, Product product){
        if (productMap.containsKey(article)){
            Product existingProduct = productMap.get(article);
            existingProduct.setCount(existingProduct.getCount() + product.getCount());
        } else {
            productMap.put(article, product);
        }
    }

    public void putProduct(String article, Product product){
        productMap.put(article, product);
    }

    public void setProductCount(String article, int newCount) {
    if (productMap.containsKey(article)) {
        Product existingProduct = productMap.get(article);
        existingProduct.setCount(newCount);
        }
    }

    public Product getProduct(String article){
        return productMap.get(article);
    }

    public void removeProduct(String article){
        productMap.remove(article);
    }

    public void printAllProducts() {
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public int size() {
        return productMap.size();
    }

    public boolean isEmpty() {
        return productMap.isEmpty();
    }
}