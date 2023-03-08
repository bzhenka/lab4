package lab4.models;

import lab4.abstracts.Building;
import lab4.abstracts.Human;
import lab4.characters.Vorchun;
import lab4.exceptions.NoSuchRoomException;
import lab4.exceptions.RoomAlreadyExistsException;
import lab4.interfaces.RoomStorageInterface;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoomStorage implements RoomStorageInterface {
    List<Room> rooms = new ArrayList<>();
    private final Building building;

    public RoomStorage(Building building) {
        this.building = building;
    }

    @Override
    public void addRoom(Human owner, int number) {
        for (Room room: rooms){
            if (number == room.getNumber()){
                throw new RoomAlreadyExistsException();
            }
        }
        rooms.add(new Room(owner, number));
    }

    @Override
    public Room getRoom(int number) {
        Room returnRoom = null;
        for (Room room : rooms) {
            if (room.getNumber() == number) {
                returnRoom = room;
                break;
            }
        }
        if (returnRoom == null) {
            throw new NoSuchRoomException();
        }
        return returnRoom;
    }

    public class Room {
        private Human owner;
        private int number;

        public Room(Human owner, int number) {
            this.owner = owner;
            this.number = number;
        }

        public Human getOwner() {
            return owner;
        }

        public void setOwner(Human owner) {
            this.owner = owner;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
        public void went(Human human){
            System.out.println("В комнату под номером " + number + " зашел " + human.getName() );
        }

        public void lieOnTheBed(int emptyBeds, Human... korotyshki){
            class LocalClass{
                String name;
                int amount;

                int amountBed;

                public LocalClass(String name, int amount, int amountBed){
                    this.name = name;
                    this.amount = amount;
                    this.amountBed = amountBed;

                }
                public void locallieonthebed(){
                    System.out.println("где лежат " + name + ", их было " + amount + ", но оставались свободные кровати, " + amountBed + " штуки");
                }
            }

            class LocalClass2{
                private final Human[] korotyshki;

                public LocalClass2(Human[] korotyshki){
                    this.korotyshki = korotyshki;
                }

                public void print(){
                    if (korotyshki.length != 0) {
                        for (int i = 0; i < korotyshki.length - 1; i ++) {
                            System.out.print(korotyshki[i].getName() + ", ");
                        }
                        System.out.println(korotyshki[korotyshki.length - 1].getName());
                    }
                    System.out.println("их было " + korotyshki.length);
                }
            }
//            LocalClass localClass = new LocalClass("коротышки", 7, 4);
//            localClass.locallieonthebed();

            System.out.println("где лежат ");

            LocalClass2 localClass2 = new LocalClass2(korotyshki);
            localClass2.print();

            System.out.println("но оставались свободные кровати, " + emptyBeds + " штук(и)");


        }

        @Override
        public String toString() {
            return "Комната №" + number + " в здании " + building + ", владелец: " + owner;
        }
    }
}
