package by.java_tutorial.week5.basics_of_oop.task3;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        Calendar.Date date1 = new Calendar.Date("04.07.2019");
        date1.setHoliday("Independence day");
        calendar.addDay(date1);

        Calendar.Date date2 = new Calendar.Date("01.12.2019");
        date2.setHoliday("New Year");
        calendar.addDay(date2);

        Calendar.Date date3 = new Calendar.Date("21.07.2019");
        calendar.addDay(date3);

        System.out.println(calendar);
    }
}
