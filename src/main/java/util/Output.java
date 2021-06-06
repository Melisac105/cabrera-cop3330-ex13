package util;

public class Output {

    static public void printOutput(double principal, double rate, int year, int numTimes, double finalAmt) {
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f", principal, rate, year, numTimes, finalAmt);
    }
}
