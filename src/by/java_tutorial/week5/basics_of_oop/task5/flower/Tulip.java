package by.java_tutorial.week5.basics_of_oop.task5.flower;

import by.java_tutorial.week5.basics_of_oop.task5.FlowerFabric;

public class Tulip extends Flower {

    public static final double TULIP_COST = 30;

    public Tulip(String colour) {
        super("Tulip", colour, TULIP_COST);
    }
}
