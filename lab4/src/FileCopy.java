import java.io.*;

public class FileCopy {
    public static void main(String[] args){
        String sourceFile1 = "input.txt";
        String destFile1 = "output.txt";

        String sourceFile2 = "error.txt";

        System.out.println("Test 1");
        testFileCopy(sourceFile1, destFile1, false);
        System.out.println("Test 2");
        testFileCopy(sourceFile2, destFile1, false );
        System.out.println("Test 3");
        testFileCopy(sourceFile1, destFile1, true);


    }
    public static void testFileCopy(String sourceFile, String destFile, boolean triggerError) {
        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destFile);

            int c;
            while ((c = reader.read()) != -1){
                writer.write(c);
            }

            reader.close();
            writer.close();
            if (triggerError) {
                writer.write("Текст после закрытия");
            }

            System.out.println("Файл скопирован");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла");
        } finally {
            System.out.println("Тест завершен\n");
        }
    }
}
