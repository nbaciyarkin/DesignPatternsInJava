package FacadePattern.LivingRoomDevices;

public class MusicSystem {
    String systemName ;
    String volume = "20";

    public MusicSystem(String systemName) {
        this.systemName = systemName;
    }

    public void turningOn(){
        System.out.println("Turning on LivingRoomSoundBar");
    }

    public void turningLivingRoomSoundBar(){
        System.out.println("Turning on LivingRoomSoundBar to"+ this.systemName);
    }

    public void setSoundBar(){
        System.out.println("Setting volume of LivingRoom SoundBar to " + volume); // default volume 20;
    }
    public void turnDownSoundBar(){
        System.out.println("Turning off LivingRoomSounbdBar");
    }

}
