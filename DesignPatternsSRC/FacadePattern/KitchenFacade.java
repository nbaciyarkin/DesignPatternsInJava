package FacadePattern;

import FacadePattern.KitchenDevices.*;

public class KitchenFacade {

    KitchenLight kitchenLight = new KitchenLight();
    Refrigerator refrigerator = new Refrigerator();
    ElectricGrill electricGrill = new ElectricGrill();
    Microwave microwave = new Microwave("Pre-Heat","200","10",electricGrill);
    CoffeMachine coffeMachine = new CoffeMachine();
    Baking baking1 = new Baking("Napoletana Pizza",microwave);
    Baking baking2 = new Baking("Margherita Pizza",microwave);
    Baking baking3 = new Baking("Marinara pİZZA",microwave);
    Baking baking4 = new Baking("Chicago-Style Deep Dish",microwave);

    public void prepareFood(){
        System.out.println("Preparing food...");
        kitchenLight.turningRoomLight();
        refrigerator.setUpRefigerator();
        microwave.turnMicrowave();
        microwave.measurementsMicrowave();
        electricGrill.turnElectricGrill();
        coffeMachine.setUp();
        baking1.bakeFood();
        baking2.bakeFood();
        baking3.bakeFood();
        baking4.bakeFood();

    }

    public void finishPreparing(){
        System.out.println("Closing kitchen...");
        refrigerator.setRefrigeratorNormal();
        electricGrill.turningOff();
        coffeMachine.turnOffMaker();
        microwave.turningOff();
        System.out.println("----------------------------------------------------");
    }
}
