package com.example.OOP.enums;

public class Basic {
    enum Week implements InterfaceA {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // enum constants
        // public, static, final
        // since its final you cant create child enums
        // type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }

        // this is not public or protected, only private or default

        // internally: public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("hey how are you?");

        }
    }

    public static void main(String[] args) {
        Week week;

        week = Week.Monday;
        week.hello();

        // for (Week day : Week.values()) {
        // System.out.println(day);
        // }

        // System.out.println(week.ordinal());
    }
}
