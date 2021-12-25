package CompositePattern;

import java.awt.print.Book;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<MusicPlayList> mixedPlaylist = new ArrayList();


	MusicPlayList jazz_list = new MusicPlayList("Jazz","is a music genre that originated in the African-American " +
            "communities of New Orleans, Louisana, United States,in the late 19th and early 20th centruies, with  it " +
            "in blues and ragtime");

	MusicPlayList indieRock_list = new MusicPlayList("Indie Rock", "Indie Rock is a genre of rock music that originated in the United States and United Kingdom in the 1970s");

	MusicPlayList RnB_list = new MusicPlayList("R&B","[Rhytm and blues] is a genre of popular music that originated in African communities" +
            "in the 1940s");

	mixedPlaylist.add(jazz_list);
	mixedPlaylist.add(indieRock_list);
	mixedPlaylist.add(RnB_list);

	// JAZZ TYPES
	MusicComponent train = new Music("Take the A train","Duke Ellington","1940");
	MusicComponent soWhat = new Music("So What","Miles Davis","1959");

    // INDIE ROCK TYPES
	MusicComponent sunGoesDown = new Music("Sun Goes Down","Artic Monkeys","2006");
	MusicComponent Obstacle = new Music("Obstacle","Interpol","2002");

    //R&B TYPES
	MusicComponent NoDiggity = new Music("No Diggity","Blakestreet","1996");
	MusicComponent CantFellMyFace = new Music("Can't Fell My Face","The weekend","2015");

	jazz_list.add(train);
	jazz_list.add(soWhat);

	indieRock_list.add(sunGoesDown);
	indieRock_list.add(Obstacle);

	RnB_list.add(NoDiggity);
	RnB_list.add(CantFellMyFace);

        for (MusicPlayList genre: mixedPlaylist) {
        	genre.print();
        }

















    }
}
