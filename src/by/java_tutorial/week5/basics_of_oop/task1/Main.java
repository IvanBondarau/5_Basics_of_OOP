package by.java_tutorial.week5.basics_of_oop.task1;

public class Main {
    public static void main(String[] args) {


        Directory testDir =  new Directory("TestDir");
        TextFile test = new TextFile("testFile", testDir);

        if (!test.isCreated()) {
            test.create("Simple test");
        }

        System.out.println(test);

        test.setName("testFile2");
        test.add("\nSimple test 2");

        System.out.println(test);


    }
}
