package CompositePattern;

import java.util.ArrayList;

public class MusicPlayList extends MusicComponent{
    private final String category;
    private final String desc;
    private ArrayList <MusicComponent>musicLeafs = new ArrayList();

    public MusicPlayList(String category, String desc) {
        this.category = category;
        this.desc = desc;
    }


    @Override
    void print() {
        System.out.println(" ");
        System.out.println(this.category + this.desc);
        for (MusicComponent music: musicLeafs) {
            music.print();
        }
    }

    @Override
    public void delete(MusicComponent musicComponent) {
        musicLeafs.remove(musicComponent);

    }

    @Override
    public void add(MusicComponent musicComponent) {
        musicLeafs.add(musicComponent);
    }
}
