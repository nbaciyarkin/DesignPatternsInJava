package FacadePattern;

import FacadePattern.AllAroundDevices.Fan;
import FacadePattern.LivingRoomDevices.MusicSystem;
import FacadePattern.LivingRoomDevices.RoomLight;
import FacadePattern.LivingRoomDevices.TV;

public class MoviePlayFacade {

    MusicSystem musicSystem = new MusicSystem("Dolby Atmos");
    LivingRoom livingRoom = new LivingRoom(musicSystem);
    TV tv = new TV("HDMI");
    MoviePlatform moviePlatform = new MoviePlatform("Netflix","Spider-Man far From Home");
    RoomLight roomLight = new RoomLight();
    Fan fan = new Fan();

    public void startMovie(){
        System.out.println("Setting up Movie...");
        fan.setOnFan();
        fan.setSpeedFan();
        roomLight.turningRoomLight();
        tv.turningLivingRoomTV();
        tv.setSourceToTv();
        musicSystem.turningOn();
        musicSystem.turningLivingRoomSoundBar();
        moviePlatform.openMoviePlatform();
        moviePlatform.openMovie();
        roomLight.dimmingRoomLight();
        musicSystem.setSoundBar();
        moviePlatform.reportMovieIsStarted();
        System.out.println("------------------------------------------");
    }

    public void stopMovie(){
        System.out.println("Stopping Movie...");
        moviePlatform.stopmovie();
        tv.turningLivingRoomTV();
        musicSystem.turnDownSoundBar();
        tv.turningOffTv();
        roomLight.settingUpBrightness();
        fan.setOffFan();
        System.out.println("------------------------------------------");
    }

}
