package comparables;


public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private Integer year;


    public Song(String title, String artist, Integer year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Song{" +
                // \ is used to print special characters
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }

    // By defining how you want to compare objects one can determine how sorting can occur
    @Override
    public int compareTo(Song o) {
        // We decided to compare year and therefore the song objects will be sorted based on years
//        if(this.getYear() > o.getYear()) {
//            return +1;
//        }
//        else if(this.getYear() < o.getYear()) {
//            return-1;
//        }
//        return 0;
        // We can also sort based on title since we decided to compare title
        return this.getTitle().compareTo(o.getTitle());
        // To sort in descending order just put a minus sign(-). It means do everything in reverse
        // return -this.getTitle().compareTo(o.getTitle());
    }
}