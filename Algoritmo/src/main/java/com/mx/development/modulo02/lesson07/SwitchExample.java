package com.mx.development.modulo02.lesson07;
public class SwitchExample {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        int x = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };
        System.out.println(x);
    }

}

 enum Day { SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }
