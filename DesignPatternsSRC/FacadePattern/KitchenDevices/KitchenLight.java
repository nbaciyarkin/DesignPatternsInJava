package FacadePattern.KitchenDevices;

import FacadePattern.AllAroundDevices.Light;

public class KitchenLight implements Light {
    @Override
    public void turningRoomLight() {
        System.out.println("Truing on Kitchen Light");
    }
    public void turningOff(){
        System.out.println("Turning Off LivingRoomFAN");
    }


}
