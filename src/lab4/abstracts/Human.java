package lab4.abstracts;

import lab4.enums.Gender;
import lab4.interfaces.GoInterface;
import lab4.interfaces.SeeInterface;
import lab4.interfaces.SpeakInterface;
import lab4.interfaces.ThinkInterface;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.Random;

public abstract class Human implements GoInterface, ThinkInterface, SeeInterface, SpeakInterface {
    private String name;
    private int age;
    private Gender gender;

    public Human() {
        System.out.println("Существо типа " + this.getClass().getName() + " создано");
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Существо типа " + this.getClass().getName() + " с именем " + name + " создано");
    }

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("Существо типа " + this.getClass().getName() + " с именем " + name + " создано");
    }

    @Override
    public void cameOut() {
        switch (gender) {
            case MALE -> System.out.println("вышел");
            case FEMALE -> System.out.println("вышла");
            default -> System.out.println("вышло");
        }
    }
    @Override
    public void cameUp(Thing thing){
        switch (gender) {
            case MALE -> System.out.println("подошел к " + thing.getName());
            case FEMALE -> System.out.println("подошла к " + thing.getName());
            default -> System.out.println("подошло к " + thing.getName());
    }}
    @Override
    public void think(String thought) {
        switch (gender) {
            case MALE -> System.out.println(name + " подумал: " + thought);
            case FEMALE -> System.out.println(name + " подумала: " + thought);
            default -> System.out.println(name + " подумало: " + thought);
        }
    }

    @Override
    public void see(Thing[] things) {
        for (Thing thing: things) {
            switch (gender) {
                case MALE -> System.out.println(name + " увидел " + thing.getName());
                case FEMALE -> System.out.println(name + " увидела " + thing.getName());
                default -> System.out.println(name + " увидело " + thing.getName());
            }
        }
    }

    @Override
    public void say(String said){
        switch (gender){
            case MALE -> System.out.println(name + " сказал: " + said);
            case FEMALE -> System.out.println(name + " сказала: " + said);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void boldness(String boldness) {
        Random random = new Random();
        int y = random.nextInt(4);
        {
            switch (y) {
                case 0 -> System.out.println(boldness + " развита на 40%");
                case 1 -> System.out.println(boldness + " развита на 100%");
                case 2 -> System.out.println(boldness + " развита на 19%");
                case 3 -> System.out.println(boldness + " развита на 78%");
            }
        }
    }

    public void resource(String resource) throws URISyntaxException, IOException {
        Random random = new Random();
        int x = random.nextInt(2);
        {
            switch (x) {
                case 0 ->
                        Desktop.getDesktop().browse(new URI("https://www.meme-arsenal.com/memes/dec834814892e9d83dd9d9690c825cb9.jpg"));
                case 1 -> System.out.println(resource + " развита на 36%");
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(name, human.name) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "имя='" + name + '\'' +
                '}';
    }
}
