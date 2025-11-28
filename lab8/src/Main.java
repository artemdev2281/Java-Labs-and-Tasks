import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Files.write(Paths.get("source.txt"), List.of("Apple", "banana", "Apricot", "cherry", "avocado", "Date"));
        DataManager dataManager = new DataManager();

        dataManager.registerDataProcessor(new FilterProcessor());
        dataManager.registerDataProcessor(new TransformProcessor());

        dataManager.loadData("source.txt");

        dataManager.processData();
    }

}
