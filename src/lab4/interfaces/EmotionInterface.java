package lab4.interfaces;

import lab4.abstracts.Human;

public interface EmotionInterface {
    String emotion();

    default void udivlenie(Human human){
        System.out.println("удивляясь над " + human.getName());
    }
    default void grimasa(Human human){
        System.out.println(human.getName() + " скроил такую гримасу");
    }
}
