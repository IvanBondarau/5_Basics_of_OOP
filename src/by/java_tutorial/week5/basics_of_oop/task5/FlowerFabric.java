package by.java_tutorial.week5.basics_of_oop.task5;


import by.java_tutorial.week5.basics_of_oop.task5.flower.Flower;
import by.java_tutorial.week5.basics_of_oop.task5.flower.Lily;
import by.java_tutorial.week5.basics_of_oop.task5.flower.Rose;
import by.java_tutorial.week5.basics_of_oop.task5.flower.Tulip;

import java.util.Scanner;

public class FlowerFabric {

    private Scanner in;

    public FlowerFabric(Scanner in) {
        this.in = in;
    }

    private String getName() {
        System.out.print("Enter flower name: ");
        String name = in.nextLine();

        if (name.toLowerCase().matches(".*rose.*")) {
            return "Rose";
        }

        if (name.toLowerCase().matches(".*lily.*")) {
            return "Lily";
        }

        if (name.toLowerCase().matches(".*tulip.*")) {
            return "Tulip";
        }

        System.out.println("Undefined flower name. Please, try again\n");

        return getName();

    }

    private String getColour() {
        System.out.print("Enter flower colour: ");
        String name = in.nextLine();

        if (name.toLowerCase().matches(".*red.*")) {
            return "red";
        }

        if (name.toLowerCase().matches(".*yellow.*")) {
            return "yellow";
        }

        if (name.toLowerCase().matches(".*white.*")) {
            return "white";
        }

        System.out.println("Undefined flower colour. Please, try again\n");

        return getColour();

    }

    public Flower getFlower() {
        String name = getName();
        String colour = getColour();

        if (name.equals("Rose")) {
            return new Rose(colour);
        }

        if (name.equals("Lily")) {
            return new Lily(colour);
        }

        return new Tulip(colour);
    }
}
