package lab4.interfaces;

import lab4.abstracts.Thing;
import lab4.exceptions.ThingNotFreeException;

public interface DressedInterface {
    void putOn(Thing thing) throws ThingNotFreeException;

}
