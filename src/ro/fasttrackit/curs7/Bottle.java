package ro.fasttrackit.curs7;

public class Bottle {

    private double totalCapacity;
    private double availableLiquid;
    public boolean open;
    private double amount;


    public Bottle(double totalCapacity, double availableLiquid, boolean open, double amount){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
        this.amount = amount;
    }

    public boolean getIfAvailableLiquid(){
        if(availableLiquid >0){
            return true;
        }else{
            return false;
        }
    }
    public double getAvailableLiquid(){
        return availableLiquid;
    }

    public double getEmptyCapacity(){
        return  totalCapacity - availableLiquid;
    }

    public String getBottleOpened(){
        if(open == true){
            return "The bottle is already opened";
        }else{
            open = true;
            return "The bottle is opened";
        }

    }

    public String getBottleClosed(){
        open = false;
        return "The bottle is closed";
    }

    public String getAmountToDrink(){

        double newAvailableLiquid = availableLiquid - amount;
        return "The amount of liquid left ater drinking " + amount + " is "  + newAvailableLiquid;
    }

    public int getDrinkFromBotlle(){
        if(open == false){
            System.out.println( "Cannot drink from a closed bottle.Please open the bottle");
        }
        if (availableLiquid < amount){
            System.out.println("Not enough liquid");
        }
        return 0;

    }



}
