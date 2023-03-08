package lab4.interfaces;

import lab4.abstracts.Human;
import lab4.models.RoomStorage.Room;

public interface RoomStorageInterface {
    void addRoom(Human owner, int number);
    Room getRoom(int number);
}
