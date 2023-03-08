package lab4.interfaces;

import lab4.abstracts.Human;
import lab4.abstracts.Thing;

public interface SeeInterface {
    void see(Thing[] things);
    default void inspect(Human human){
        System.out.println("осмотрела");
    }
    default void look(Human human){
        System.out.println("смотрела");
    }
}
