package les11.exception;

// Выбрала RuntimeException чтобы показать что ошибку можно поймать без throws в объявлении метода
public class EmptyNameException extends RuntimeException {

    public EmptyNameException(String message) {
        super(message);
    }
}
