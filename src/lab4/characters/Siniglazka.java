package lab4.characters;

import lab4.abstracts.Human;
import lab4.enums.Gender;

public class Siniglazka extends Human {
    public Siniglazka() {
        super("Синеглазка", Gender.FEMALE);
    }
    @Override
    public void cameOut(){
        System.out.println("Синуглазка вышла из комнаты");
    }
}
