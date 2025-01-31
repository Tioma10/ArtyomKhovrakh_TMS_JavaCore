package lesson13.homework;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super();
    }
}
