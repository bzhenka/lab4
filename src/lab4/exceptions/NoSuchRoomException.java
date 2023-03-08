package lab4.exceptions;

public class NoSuchRoomException extends IllegalArgumentException {
    public NoSuchRoomException() {
        super("Такая комната не найдена");
    }
}
