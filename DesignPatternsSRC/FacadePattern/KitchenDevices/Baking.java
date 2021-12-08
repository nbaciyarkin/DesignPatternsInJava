package FacadePattern.KitchenDevices;

import FacadePattern.KitchenDevices.Microwave;

public class Baking {
    String name;
    Microwave microwave;

    public Baking(String name, Microwave microwave) {
        this.name = name;
        this.microwave = microwave;
    }

    public void bakeFood(){
        System.out.println("Baking "+name+"Microwave on " + microwave.getHeat() +","+ "Temperature"+ microwave.getTemperature()
                +", Time" + microwave.getTime());
    }

}
