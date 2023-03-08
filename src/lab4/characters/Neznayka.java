package lab4.characters;

import lab4.abstracts.Human;
import lab4.abstracts.Thing;
import lab4.enums.Gender;
import lab4.exceptions.ThingNotFreeException;
import lab4.interfaces.*;

import java.util.Random;

public class Neznayka extends Human implements DressedInterface, TakeInterface{
    public Neznayka() {
        super("Незнайка", Gender.MALE);
    }


    @Override
    public void putOn(Thing thing) throws ThingNotFreeException {
        if (thing.isFree()) {
            Random random = new Random();
            int x = random.nextInt(3);
            switch (x) {
                case 0 -> System.out.println("Незнайка надел " + thing.getProperty() + " " + thing.getName());
                case 1 -> System.out.println("Незнайка напялил " + thing.getProperty() + " " + thing.getName());
                case 2 -> System.out.println("Незнайка нацепил " + thing.getProperty() + " " + thing.getName());
            }
        } else {
            throw new ThingNotFreeException();
        }
    }

    @Override
    public void take(Thing thing) {
        System.out.println("Незнайка захватил " + thing.getProperty()+ " " +  thing.getName());
    }
    @Override
    public void cameOut(){
        System.out.println("Незнайка вышел из комнаты");
    }

    @Override
    public void boldness(String boldness){
        System.out.println("у " + getName() + " есть " + boldness);
    }





}
