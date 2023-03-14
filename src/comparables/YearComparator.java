package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class YearComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if(o1.getYear() > o2.getYear()) {
            return  +1;
        }
        else if(o1.getYear() < o2.getYear()) {
            return -1;
        }
        return 0;
    }
}