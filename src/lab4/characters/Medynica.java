package lab4.characters;

import lab4.abstracts.Human;
import lab4.abstracts.Thing;
import lab4.enums.Gender;
import lab4.enums.Week;
import lab4.interfaces.LeaveInterface;

import java.util.List;
import java.util.Random;


public class Medynica extends Human implements LeaveInterface {
    public Medynica() {
        super("Медуница", Gender.FEMALE);
    }

    @Override
    public void leave(Thing thing) {
        thing.setFree(true);
        List<Week> enumList = List.of(Week.values());
        Random random = new Random();
        Week randomElement = enumList.get(random.nextInt(enumList.size()));
        System.out.println(getName() + " оставила на столе в " + randomElement + " " + thing.getName());
    }


    public void turnAround(Human human){
        System.out.println(getName() + " повернулась к " + human.getName());

    }
}





