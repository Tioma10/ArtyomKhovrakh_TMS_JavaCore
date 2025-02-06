package lesson15.homework;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Animals {
    private ArrayDeque<String> animals;

    public Animals() {
        this.animals = new ArrayDeque<>();
    }

    public void add(String name) {
        animals.addFirst(name);
    }

    public void remove(){
        animals.removeLast();
    }

    public Iterable<String> iterator(){
        return animals;
    }
}
