package lab4.abstracts;
import lab4.interfaces.Hang;
import lab4.interfaces.ObjectInterface;
import lab4.things.Veshalka;

import java.util.Objects;

public abstract class Thing implements ObjectInterface, Hang {
    private final String name; //создаю закрытую переменую
    private String property = "";
    boolean free = false;

    // создаю конструктор, который дает имя
    public Thing(String name){
        this.name = name;
        generate();
    }

    public String getName() {
        return name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
        System.out.println("Объекту " + name + " добавлено свойство " + property);
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public void hang(Veshalka veshalka) {
        System.out.println(getName() + " повесили на " + veshalka.getName());
        free = true;
    }

    // переопределяю методы из интерфейсов
    @Override
    public void generate(){
        System.out.println("Предмет " + name + " " +
                "типа " + this.getClass().getName() + " создан");
    }


    // переопределение toString()
    @Override
    public String toString(){
        return "Вещь='" + name + "'";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing thing)) return false;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
