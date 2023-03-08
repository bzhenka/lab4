package lab4;

import lab4.abstracts.Building;
import lab4.abstracts.Thing;
import lab4.characters.*;
import lab4.exceptions.ThingNotFreeException;
import lab4.interfaces.GoInterface;
import lab4.models.Hospital;
import lab4.models.RoomStorage.Room;
import lab4.things.*;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        Siniglazka siniglazka = new Siniglazka();
        Neznayka neznayka = new Neznayka();
        Snezhinka snezhinka = new Snezhinka();
        Medynica medynica = new Medynica();
        Vorchun vorchun = new Vorchun();
        System.out.println();
        Hospital bolnitsa = new Hospital();
        bolnitsa.addRoom(medynica, 1);
        bolnitsa.getRoom(1);
        System.out.println();
        Plaster plaster = new Plaster("телесный");
        Robe robe = new Robe("белый");
        WearableThing colpac = new WearableThing("колпак") {
            @Override
            public void putOn() {
                System.out.println(getName() + " на голове");
            }
        };

        Veshalka veshalka = new Veshalka("коричневая");

        WearableThing glasses = new WearableThing("очки") {
            @Override
            public void putOn(){
                System.out.println(getName() + " на носу!");
            }
        };

        System.out.println(glasses.getClass().getName());
        Palochka palochka = new Palochka("деревянная");
        System.out.println();

        medynica.think("что разговор с Незнайкой оконченн");
        medynica.turnAround(siniglazka);
        System.out.println();
        medynica.say(" - Ну ка, покажите мне ваш лоб, милочка");
        snezhinka.unstick(plaster);
        snezhinka.inspect(siniglazka);
        medynica.say(" — Пластырь вам больше не нужен");
        GoInterface goInterface = siniglazka;
        goInterface.cameOut();
        goInterface = snezhinka;
        goInterface.cameOut();
        robe.hang(veshalka);
        colpac.hang(veshalka);
        Thing[] things = {robe, colpac};
        neznayka.see(things);

        try {
            neznayka.putOn(robe);
        } catch (ThingNotFreeException e) {
            System.out.println("Невозможно надеть халат: " + e.getMessage());
        }
        try {
            neznayka.putOn(colpac);
            colpac.putOn();
        } catch (ThingNotFreeException e) {
            System.out.println("Невозможно надеть колпак: " + e.getMessage());
        }

        medynica.leave(glasses);
        try {
            neznayka.putOn(glasses);
            glasses.putOn();
        } catch (ThingNotFreeException e) {
            System.out.println("Невозможно надеть очки: " + e.getMessage());
        }

        neznayka.take(palochka);

        System.out.println();

        neznayka.cameOut();
        snezhinka.look(neznayka);
        snezhinka.udivlenie(neznayka);
        neznayka.boldness("смелость");
        snezhinka.boldness("смелость");
        neznayka.resource("находчивость");
        Hospital.hall.walkdownhall(neznayka);
        bolnitsa.addRoom(medynica, 2);
        Room number2 = bolnitsa.getRoom(2);
        number2.went(neznayka);
        number2.lieOnTheBed(4, vorchun);
        vorchun.look(neznayka);
        neznayka.say("— Как вы себя чувствуете, больной?");
        vorchun.say("Прекрасно");
        vorchun.grimasa(vorchun);
        vorchun.dead();
        neznayka.say(" Встаньте, больной");
        vorchun.seat();





    }
}
