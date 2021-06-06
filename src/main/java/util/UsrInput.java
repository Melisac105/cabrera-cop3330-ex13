package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public double getPrincipal() {
        System.out.print("What is the principal amount? ");
        return input.nextDouble();
    }

    static public double getRate() {
        System.out.print("What is the rate? ");
        return input.nextDouble();
    }

    static public int getNumYears() {
        System.out.print("What is the number of years? ");
        return input.nextInt();
    }

    static public int getNumTimes() {
        System.out.print("What is the number of times the interest is compound per year? ");
        return input.nextInt();
    }
}
