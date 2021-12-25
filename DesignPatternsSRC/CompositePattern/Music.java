package CompositePattern;

public class Music extends MusicComponent {
    private final String name;
    private final String bandName;
    private final String releaseDate;

    public Music(String name, String bandName, String releaseDate) {
        this.name = name;
        this.bandName = bandName;
        this.releaseDate = releaseDate;
    }

    @Override
    void print() {
        System.out.println(this.name + "was recorded by " + this.bandName + "in " + this.releaseDate);
    }
}
