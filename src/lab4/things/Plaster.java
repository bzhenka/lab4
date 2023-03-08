package lab4.things;

import lab4.abstracts.Thing;

public class Plaster extends Thing {
    public Plaster(String coloring) {
        super("пластырь");
        if (coloring != null) {
            setProperty(coloring);
        }
    }
}
