package by.java_tutorial.week5.basics_of_oop.task4.treasure;

public class Treasure {

    private String name;
    private double cost;

    public Treasure(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " (" + cost + "$)";
    }
}
