package by.java_tutorial.week5.basics_of_oop.task3;

import java.util.ArrayList;
import java.util.Locale;

public class Calendar {

    private ArrayList<Date> days;

    Calendar() {
        days = new ArrayList<>();
    }

    public ArrayList<Date> getDays() {
        return days;
    }

    public void setDays(ArrayList<Date> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        String res = "";
        for (var day:days) {
            res += day + "\n";
        }
        return res;
    }

    public void addDay(Date date) {
        days.add(date);
    }

    public static class Date {

        private int day;
        private int month;
        private int year;
        private int dayOfWeek;
        private String dayOfWeekStr;
        private boolean isHoliday;
        private String name;

        Date(String strDate) {
            if (strDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
                day = Integer.parseInt(strDate.substring(0, 2));
                month = Integer.parseInt(strDate.substring(3, 5));
                year = Integer.parseInt(strDate.substring(6));

                if (day <= 0 || month <= 0 || year <= 0) {
                    setDefault();
                }
            } else {
                setDefault();
            }

            java.util.Calendar c = java.util.Calendar.getInstance();
            c.set(year, month, day);
            dayOfWeek = c.get(java.util.Calendar.DAY_OF_WEEK);
            dayOfWeekStr = c.getDisplayName(java.util.Calendar.DAY_OF_WEEK, java.util.Calendar.SHORT, Locale.US);

        }

        Date(Date other) {
            this.day = other.day;
            this.month = other.month;
            this.year = other.year;
        }

        public void setDefault() {
            this.day = DEFAULT_DATE.day;
            this.month = DEFAULT_DATE.month;
            this.year = DEFAULT_DATE.year;
        }

        public static final Date DEFAULT_DATE = new Date("01.01.1970");

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setHoliday(String holiday) {
            if (holiday == null) {
                isHoliday = false;
            } else {
                isHoliday = true;
                name = holiday;
            }

        }

        @Override
        public String toString() {
            String res = String.format("%02d.%02d.%04d %s", day, month, year, dayOfWeekStr);
            if (isHoliday) {
                res += " " + (isHoliday ? name : "");
            } else if (day == 1 || day == 7) {
                res += " WEEKEND";
            }
            return res;
        }
    }
}
