import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "text.txt";
        File file = new File(filePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map<String, Integer> wordCount = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-zа-я0-9]", "");
            if (word.isEmpty()) {
                continue;
            }

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        scanner.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Топ-10 самых частых слов:");
        for (int i = 0; i < 10 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
        }
    }
}
