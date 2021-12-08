package FacadePattern.LivingRoomDevices;

import FacadePattern.AllAroundDevices.Light;

public class RoomLight implements Light {
    @Override
    public void turningRoomLight() {
        System.out.println("Turning on KitchenLight");
    }

    public void dimmingRoomLight(){
        System.out.println("Dimming Living RoomLight");
    }

    public void settingUpBrightness(){
        System.out.println("LivingRoomLight to 100");
    }


}
