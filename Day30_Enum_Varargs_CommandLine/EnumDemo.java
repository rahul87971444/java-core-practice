enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
        for(Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
/*
Today is MONDAY

MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY*/
