package lab4.models;

import lab4.abstracts.Building;
import lab4.abstracts.Human;

public class Hospital extends Building {
    public Hospital() {
        super("Больница");
    }
    static public class hall{
        public static void walkdownhall(Human human){
            System.out.println(human.getName() + " идет по коридору");
        }
    }
}
