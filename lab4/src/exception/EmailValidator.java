package exception;

public class EmailValidator {
    public static void validate(String email) throws CustomEmailFormatException {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new CustomEmailFormatException("неверный формат - " + email);
        }
        System.out.println("Корректный email");
    }
}
