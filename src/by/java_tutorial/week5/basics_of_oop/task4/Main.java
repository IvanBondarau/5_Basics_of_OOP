package by.java_tutorial.week5.basics_of_oop.task4;

import by.java_tutorial.week5.basics_of_oop.task4.treasure.Treasure;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DragonsCave dragonsCave = new DragonsCave();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add random treasure");
            System.out.println("2. Add custom treasure");
            System.out.println("3. Print all treasure");
            System.out.println("4. Search the most expensive treasure");
            System.out.println("5. Search for treasure for a given sum");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            int choice = in.nextInt();

            System.out.println();

            switch (choice) {
                case 1: {
                    System.out.println("Enter number of random treasure: ");
                    int number = in.nextInt();
                    for (int i = 0; i < number; i++) {
                        dragonsCave.addRandomTreasure();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Adding new treasure");
                    in.nextLine();
                    System.out.print("Enter the name of the treasure: ");
                    String name = in.nextLine();
                    System.out.println("Enter the cost of the treasure: ");
                    double cost = in.nextDouble();
                    dragonsCave.addTreasure(new Treasure(name, cost));
                    break;
                }

                case 3:
                    System.out.println(dragonsCave);
                    break;

                case 4:
                    System.out.println(dragonsCave.searchMostExpensive());
                    break;
                case 5:
                    in.nextLine();
                    System.out.print("Enter total sum: ");
                    double sum = in.nextDouble();
                    dragonsCave.searchBySum(sum);
                    break;
                case 6:
                    System.exit(0);


            }
        }
    }
}
