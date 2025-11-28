import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DataManager {
    private List<Object> processors = new ArrayList<>();
    private List<String> data = new ArrayList<>();

    private ExecutorService executor = Executors.newFixedThreadPool(4);

    public void registerDataProcessor(Object processor) {
        processors.add(processor);
    }

    public void loadData(String source) {
        try {
            data = Files.readAllLines(Paths.get(source));
            System.out.println("Данные загружены:" + data);
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения файла. Будут использованы тестовые данные");
            data = List.of("Apple", "Banana", "Apricot", "Cherry", "Avocado");
        } 
    }

    public void processData() {
        List<Future<List<String>>> futures = new ArrayList<>();
        
        for (Object processor : processors) {
            Method[] methods = processor.getClass().getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(DataProcessor.class)) {
                    Callable<List<String>> task = () -> {
                        @SuppressWarnings("unchecked")
                        List<String> result = (List<String>) method.invoke(processor, data);
                        return result;
                    };
                    futures.add(executor.submit(task));
                }
            }
        }
        processResults(futures);
    }
    
    public void processResults(List<Future<List<String>>> futures) {
        for (Future<List<String>> future : futures) {
            try {
                List<String> result = future.get();
                System.out.println("Результат обработки: " + result);

                saveData(result, "output_" + System.currentTimeMillis() + ".txt");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    public void saveData(List<String> dataToSave, String destination) {
        try {
            Files.write(Paths.get(destination), dataToSave, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Данные сохранены в " + destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
