package lab4.characters;

import lab4.abstracts.Human;
import lab4.enums.Gender;
import lab4.interfaces.EmotionInterface;

import java.util.Random;

public class Vorchun extends Human implements EmotionInterface {
    public Vorchun() {
        super("Ворчун", Gender.MALE);
    }

    @Override
    public String emotion(){
        return ("угрюма и недовольна");
    }
    @Override
    public void look(Human human){
        System.out.println(getName() + " смотрел " + emotion() + " на " +  human.getName());
    }
    public void dead(){
        Random random = new Random();
        int x = random.nextInt(3);
        switch (x){
            case 0 -> System.out.println("словно собирался через пять минут помереть");
            case 1 -> System.out.println("словно собирался через десять минут помереть");
            case 2 -> System.out.println("словно собирался через тридцать минут помереть");
        }
    }
    public void seat(){
        System.out.println(getName() + " нехотя приподнялся и сел на постели.");
    }
}
