package exception;

public class Main {
    public static void main(String[] args) {
        String[] emails = {
            "valid@example.com",
            "invalid.email",
            "user@domain",
            "test@mail.ru"
        };
        for (String email : emails) {
            try {
                EmailValidator.validate(email);
            } catch (CustomEmailFormatException e){
                System.out.println("Ошибка: " + e.getMessage());
                ExceptionLogger.log(e);
            }
        }
    }
}
