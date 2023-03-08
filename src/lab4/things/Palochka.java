package lab4.things;

import lab4.abstracts.Thing;

public class Palochka extends Thing {
    public Palochka(String material) {
        super("палочка");
        if (material != null) {
            setProperty(material);
        }
    }
}
