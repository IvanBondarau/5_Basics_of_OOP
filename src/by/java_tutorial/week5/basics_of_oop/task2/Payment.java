package by.java_tutorial.week5.basics_of_oop.task2;

import java.util.ArrayList;

public class Payment {

    private static int idCounter = 0;

    private int id;
    private ArrayList<Item> items;

    public Payment() {
        this.id = idCounter++;
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    public double getTotalCost() {

        double res = 0;

        for (var item: items) {
            res += item.getCost();
        }

        return res;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        String res =  "Payment ID: " + id + "\n";
        res += "Items:\n";

        for (var item: items) {
            res += item.toString() + "\n\n";
        }

        res += "Total cost: " + getTotalCost();
        return res;

    }


    public static class Item {

        private String name;
        private int count;
        private double cost;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public Item(String name, int count, double cost) {
            this.name = name;
            this.count = count;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Name: " + this.name + "\n"
                    + "Count: " + this.count + "\n"
                    + "Cost: " + this.cost;
        }
    }
}
