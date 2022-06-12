package com.digicelgroup;

import java.lang.ref.Reference;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // this is a comment
        // System.out.println("Hello world!");
        /* This is a multi-line comment system
        This will help in documenting my code!
        String name = "Shaviya";
         */


        /* int num = 100;
        Double decimal = 100.88;
        double deci = 104.104;

        Date date = new Date();
         */

        // Primitive Data Types
        /*
        byte, short, int, long(L), float(F), double, boolean, char
        float smallDecimal = 3.14F;
        char letter = 'S';
        System.out.println(smallDecimal);

        int bigNum = 234_556_039;
        System.out.println(bigNum);
         */

        // Reference/ Non-primitive/ Objects Data Types
        /*
        These will be used a majority of times
        String name = new String("Shaviya");
        System.out.println(name.toUpperCase(Locale.ROOT));

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);
         */


        //Naming of variables
        /* - Always name them in a way that makes sense!
        - Always use Camel case naming system when names are long
        - Variables should never start with an upper case
         */

        // The String Class
        /*
        char is a single character - uses single quotes
        String is a series of characters - uses double quotes
        new String is a keyword but it can be dropped
        String name = new String("ShaviyaVictor");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("ShaviyaVictor"));
         */

        // Packages and Import Keyword
        // Reserved keywords
        /*
        Packages and imports are always at the top
        Imports can only be made explicitly when an import has already been made
        Reserved keywords are only used by the language itself
        e.g: Package, public, class, static, void, int, final - But the IDE will always tell

         */


        // Arithmetic operations && The Math Class
        /*

        int total = 236_786;
        int lockAccount = 56_194;

        int subtract = total - lockAccount;
        System.out.println(subtract);
        System.out.println(74_750 + 105_842 + 50_000 + 40_000 + 40_000);

        double trial = Math.ceil(22.1342);
        System.out.println(trial);
        System.out.println((int) Math.pow(3, 2));
         */

        // Comparison operators
        /*
        These help us compare values
        <, >, ==, !=, <=, >=
         */
        int vicAge = 25;
        int josAge = 28;

        boolean isVicOlder = vicAge <= josAge;

        System.out.println(isVicOlder);

// The below code is the one that uses the static class created below

        // Difference between Primitive data types and Non-primitive/Reference data types
        /*

        int a = 10;
        int b = a;
        a = 20;
        System.out.println("a - " + a + " b - " + b );

        Person vic = new Person("Shaviya");
        Person shav = vic;

        System.out.println("Before");
        System.out.println(vic.name + " - " + shav.name);

        shav.name = "Victor";

        System.out.println("After");
        System.out.println(vic.name + " - " + shav.name);
         */

    }

    // Created a class to create objects/ References from
    /*
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
     */

}