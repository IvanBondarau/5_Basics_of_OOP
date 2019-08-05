package by.java_tutorial.week5.basics_of_oop.task5;

import by.java_tutorial.week5.basics_of_oop.task5.flower.Flower;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        FlowerFabric fabric = new FlowerFabric(in);

        FlowerComposition composition = new FlowerComposition();

        System.out.println("Enter number of flowers in colour composition: ");
        int numOfFlowers = in.nextInt();
        in.nextLine();

        for (int it = 0; it < numOfFlowers; it++) {
            System.out.println("Flower " + (it + 1));
            Flower flower = fabric.getFlower();
            composition.addFlower(flower);
        }

        System.out.println(composition);
    }
}
