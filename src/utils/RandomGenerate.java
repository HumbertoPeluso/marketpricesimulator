package utils;

import java.util.Random;

public class RandomGenerate {

    private static  Random r = new Random();

    public static int generateNumberOfShares(){

        return r.nextInt(1000-500)+ 500;
    }

    public static double generateSharePrice(){
        return 10+(100-10)*r.nextDouble();
    }

    public static double generateBudget(){

        return 1000+(10000-1000)*r.nextDouble();
    }

}
