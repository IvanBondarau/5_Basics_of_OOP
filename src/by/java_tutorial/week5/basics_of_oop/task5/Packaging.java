package by.java_tutorial.week5.basics_of_oop.task5;

public class Packaging {

    private double cost;

    public Packaging(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Packing(" + cost + ")";
    }
}
