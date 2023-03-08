package lab4.exceptions;

public class ThingNotFreeException extends Exception {
    public ThingNotFreeException() {
        super("Вещь используется кем-то другим");
    }
}
