package exception;
import java.io.*;

public class ExceptionLogger {
    public static void log(Exception e){
        try(FileWriter writer = new FileWriter("exceptions.log", true)) {
            writer.write(e.getClass().getSimpleName() + ": " + e.getMessage() + "\n");
        } catch (IOException ioException) {
            System.out.println("Ошибка при записи лога: " + ioException.getMessage());
        }
    }
}
