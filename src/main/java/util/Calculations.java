package util;

public class Calculations {

    static public double calcFinalAmount(double principal, double rate, int numCompound, int years){
        double base = 1+ ((rate / 100) / numCompound);
        double exp = numCompound * years;
        double finalAmount = principal* Math.pow(base, exp);
        return Math.round(finalAmount * 100) / 100.0;
    }
}
