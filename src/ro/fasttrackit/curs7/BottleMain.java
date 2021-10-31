package ro.fasttrackit.curs7;

import java.util.Scanner;

public class BottleMain {
    public static void main(String[] args){
        Bottle bottle = new Bottle(1500, 1000, false, 1100);
        System.out.println(bottle.getIfAvailableLiquid());
        System.out.println(bottle.getAvailableLiquid());
        System.out.println(bottle.getEmptyCapacity());
        System.out.println(bottle.getBottleOpened());
        System.out.println(bottle.getBottleClosed());
        System.out.println(bottle.getAmountToDrink());
        System.out.println(bottle.getDrinkFromBotlle());
    }
}
