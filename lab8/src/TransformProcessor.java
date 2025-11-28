import java.util.List;
import java.util.stream.Collectors;

public class TransformProcessor {
    @DataProcessor(description = "Convert to Upper Case")
    public List<String> transformData(List<String> data) {
        System.out.println("Запущена трансформация в потоке: " + Thread.currentThread().getName());
        return data.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
