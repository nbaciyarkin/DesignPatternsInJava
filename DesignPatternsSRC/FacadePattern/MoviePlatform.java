package FacadePattern;

public class MoviePlatform {
    String moviePlatform;
    String movieName;

    public MoviePlatform(String moviePlatform, String movieName) {
        this.moviePlatform = moviePlatform;
        this.movieName = movieName;
    }

    public void openMoviePlatform(){
        System.out.println("Opening" + moviePlatform + "on LivingRoomFire4KTVstick");
    }
    public void openMovie(){
        System.out.println("Searching" + movieName + "on" + moviePlatform);
    }

    public void reportMovieIsStarted(){
            System.out.println("Playing" + movieName + "on" + moviePlatform);
    }

    public void stopmovie(){
        System.out.println("Closing "+ moviePlatform+ "on LivingRoomFireTV4KStick");
    }


}
