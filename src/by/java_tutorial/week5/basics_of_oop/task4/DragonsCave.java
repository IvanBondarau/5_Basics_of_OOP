package by.java_tutorial.week5.basics_of_oop.task4;

import by.java_tutorial.week5.basics_of_oop.task4.treasure.*;

import java.util.Comparator;
import java.util.Random;

public class DragonsCave {

    private Random rand;
    private Treasure[] treasures;
    private int numOfTreasures;

    public DragonsCave() {
        treasures = new Treasure[100];
        numOfTreasures = 0;
        rand = new Random();
    }


    public int getNumOfTreasures() {
        return numOfTreasures;
    }


    public void addTreasure(Treasure treasure) {
        if (numOfTreasures == 100) {
            System.out.println("Cave is full");
        } else {
            treasures[numOfTreasures++] = treasure;
        }
    }

    public Treasure getTreasure(int index) {
        if (index < 0 || index > 100) {
            return null;
        }
        return treasures[index];
    }

    public Treasure setTreasure(int index, Treasure treasure) {
        if (index < 0 || index > 100) {
            return null;
        }

        Treasure oldTreasure = treasures[index];
        treasures[index] = treasure;
        return oldTreasure;
    }

    public void addRandomTreasure() {
        double cost = rand.nextDouble() * 10000d;

        int type = rand.nextInt(4);
        switch (type) {
            case 0:
                addTreasure(new Crown(cost));
                break;
            case 1:
                addTreasure(new Diamond(cost));
                break;
            case 2:
                addTreasure(new MagicSword(cost));
                break;
            case 3:
                addTreasure(new Necklace(cost));
                break;
        }
    }

    public Treasure searchMostExpensive() {
        Treasure ans = new Treasure(null, Double.NEGATIVE_INFINITY);
        for (int i = 0; i < numOfTreasures; i++) {
            if (treasures[i].getCost() > ans.getCost()) {
                ans = treasures[i];
            }
        }
        if (ans.getCost() == Double.NEGATIVE_INFINITY) {
            return null;
        } else {
            return ans;
        }
    }

    public void searchBySum(double sum) {
        double totalSum = 0d;

        for (int i = 0; i < numOfTreasures; i++) {
            if (treasures[i] != null) {
                totalSum += treasures[i].getCost();
            }
        }

        if (totalSum < sum) {
            System.out.println("Impossible: treasure are too cheap");
        } else {
            totalSum = 0;
            for (int i = 0; i < numOfTreasures; i++) {
                if (treasures[i] != null) {
                    totalSum += treasures[i].getCost();
                    System.out.println(treasures[i]);
                }

                if (totalSum >= sum) {
                    System.out.println("Total sum: " + totalSum);
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = "Dragon's cave\n";
        for (int i = 0; i < numOfTreasures;i++) {
            if (treasures[i] != null) {
                res += (i + 1) + ". " + treasures[i] + "\n";
            }
        }
        return res;
    }

    public static class TreasureCostComparator implements Comparator<Treasure> {

        @Override
        public int compare(Treasure a, Treasure b) {
            return Double.compare(b.getCost(), a.getCost());
        }
    }
}
