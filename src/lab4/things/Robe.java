package lab4.things;

import lab4.abstracts.Thing;
import lab4.interfaces.Hang;

public class Robe extends Thing implements Hang {
    public Robe(String color) {
        super("халат");
        if (color != null){
            setProperty(color);
        }
    }
}
