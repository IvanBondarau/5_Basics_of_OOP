package by.java_tutorial.week5.basics_of_oop.task5.flower;

public abstract class Flower {

    private String name;
    private String colour;
    private double cost;


    public Flower(String name, String colour, double cost) {
        this.name = name;
        this.colour = colour;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Flower " + name + "(" + colour + ") - " + cost;
    }
}
