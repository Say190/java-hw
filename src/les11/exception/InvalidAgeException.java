package les11.exception;

// Чтобы компилятор требовал обработку ошибки
public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }


}
