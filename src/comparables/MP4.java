package comparables;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

    // ctrl + shift + i => See method implementation

    public static void main(String[] args) {
        Song song1 = new Song("X","Q",32);
        Song song2 = new Song("C","P",4);
        Song song3 = new Song("W","C",34);
        Song song4 = new Song("D","A",53);
        Song song5 = new Song("G","Y",22);
        Song song6 = new Song("U","C",24);

        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(song1);
        musicList.add(song6);
        musicList.add(song5);
        musicList.add(song3);
        musicList.add(song2);
        musicList.add(song4);

        MyUtils.iterateAnyList(musicList);
        // Sort method calls compareTo method internally
        // Sort by title
        // Implements the compareTo method in the song class
        // This is sorting via Comparable
        Collections.sort(musicList);
        System.out.println("After sorting by title.....");
        MyUtils.iterateAnyList(musicList);
        // This is sorting via Comparator
        musicList.sort(new YearComparator());
        System.out.println("After sorting by year.....");
        MyUtils.iterateAnyList(musicList);

    }

}
