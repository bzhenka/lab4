package lab4.things;

import lab4.abstracts.Thing;

public class Veshalka extends Thing {
    public Veshalka(String chvet) {
        super("вешалка");
        if (chvet != null) {
            setProperty(chvet);
        }
    }
}
