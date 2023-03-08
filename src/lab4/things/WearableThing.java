package lab4.things;

import lab4.abstracts.Thing;
import lab4.interfaces.WearableInterface;

public class WearableThing extends Thing implements WearableInterface {
    public WearableThing(String name) {
        super(name);
    }

    @Override
    public void putOn() {
        System.out.println(getName() + " надет(о)(а)");
    }
}
