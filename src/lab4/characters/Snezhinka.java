package lab4.characters;

import lab4.abstracts.Human;
import lab4.abstracts.Thing;
import lab4.enums.Gender;
import lab4.interfaces.EmotionInterface;

import java.util.Random;

public class Snezhinka extends Human implements EmotionInterface {
    public Snezhinka(){
        super("Снежинка", Gender.FEMALE);
    }

    public void unstick(Thing thing) {
        Random random = new Random();
        int y = random.nextInt(3);{
            switch (y){
                case 0 -> System.out.println(getName() + " отклеила на 10% процентов " + thing.getProperty() + " " + thing.getName());
                case 1 -> System.out.println(getName() + " отклеила на 197% процентов " + thing.getProperty() + " " + thing.getName());
                case 2 -> System.out.println(getName() + " отклеила на 36% процентов " + thing.getProperty() + " " + thing.getName());
            }

        }

    }
    @Override
    public void inspect(Human human){
        System.out.println(human.getName() + " осмотрен Снежинкой" );
    }
    @Override
    public void cameOut(){
        System.out.println("Снежинка вышла из комнаты");

    }
    @Override
    public void look(Human human){
        System.out.println(getName() + " смотрела " + emotion() + " на " +  human.getName());
    }
    @Override
    public String emotion(){
        return ("с восторгом");

    }
}
