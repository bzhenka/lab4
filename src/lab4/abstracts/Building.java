package lab4.abstracts;

import lab4.interfaces.RoomStorageInterface;
import lab4.models.RoomStorage;

import java.util.Objects;

public abstract class Building {
    private String type;
    private int number;
    private String street;
    RoomStorageInterface roomStorage = new RoomStorage(this);

    public Building(String type){
        this.type = type;
        System.out.println("Строение типа " + this.getClass().getName() + " создано");
    }

    public void addRoom(Human owner, int number) {
        System.out.println("Комната номер " + number + " добавлена в " + type);
        roomStorage.addRoom(owner, number);
    }

    public RoomStorage.Room getRoom(int number) {
        System.out.println("Получаю информацию о комнате номер " + number);
        return roomStorage.getRoom(number);
    }

    public int getNumber() {
        return number;
    }


    public String getStreet() {
        return street;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Строение типа " + this.getClass().getName() + " по адресу " + street + " " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building building)) return false;
        return number == building.number && Objects.equals(street, building.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number);

}}
