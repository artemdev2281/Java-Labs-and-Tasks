import java.util.List;
import java.util.stream.Collectors;

public class FilterProcessor {

    @DataProcessor(description = "Filter strings starting with 'A'")
    public List<String> filterData(List<String> data) {
        System.out.println("Запущен фильтр в потоке: " + Thread.currentThread().getName());
        return data.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
    }
}