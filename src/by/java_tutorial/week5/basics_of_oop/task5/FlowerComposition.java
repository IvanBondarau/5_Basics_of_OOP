package by.java_tutorial.week5.basics_of_oop.task5;

import by.java_tutorial.week5.basics_of_oop.task5.flower.Flower;

import java.util.ArrayList;

public class FlowerComposition {

    private Packaging packaging;
    private ArrayList<Flower> flowers;

    public FlowerComposition() {
        flowers = new ArrayList<>();
        packaging = new Packaging(0);
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
        packaging.setCost((flowers.size() / 5 + 1) * 5);
    }

    @Override
    public String toString() {
        double totalCost = 0.d;
        String res;
        res = "Flower composition\n";
        for (var flower: flowers) {
            res += flower + "\n";
            totalCost += flower.getCost();
        }
        res += packaging + "\n";
        totalCost += packaging.getCost();

        res += "Total cost: " + totalCost;

        return res;
    }


}
