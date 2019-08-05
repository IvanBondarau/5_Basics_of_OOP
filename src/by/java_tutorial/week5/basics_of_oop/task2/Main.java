package by.java_tutorial.week5.basics_of_oop.task2;

public class Main {

    public static void main(String[] args) {

        Payment testPayment = new Payment();

        Payment.Item testItem1 = new Payment.Item("IPhone", 10, 1e9d);
        Payment.Item testItem2 = new Payment.Item("MacBook", 20, 1e10d);

        testPayment.addItem(testItem1);
        testPayment.addItem(testItem2);

        System.out.println(testPayment);

    }
}
