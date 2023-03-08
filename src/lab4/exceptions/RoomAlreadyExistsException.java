package lab4.exceptions;

public class RoomAlreadyExistsException extends IllegalArgumentException{
    public RoomAlreadyExistsException() {
        super("Такая комната уже существует");
    }
}
