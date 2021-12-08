package FacadePattern.LivingRoomDevices;

public class TV {
    String source;

    public TV(String source) {
        this.source = source;
    }

    public void turningLivingRoomTV(){
        System.out.println("Turning On LivingRoomTv");
    }
    public void setSourceToTv(){
        System.out.println("Setting source of LivingRoomTv to "+ this.source);
    }
    public void turningRoomFireTV(){
        System.out.println("Turning on LivingRoomFireTV4KStick");
    }
    public void turningOffTv(){
        System.out.println("Turning off LivingRoomTV");
    }


}
