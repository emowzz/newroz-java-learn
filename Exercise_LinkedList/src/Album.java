import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration)
    {
        if (findSong(songTitle) != null)
        {
            return false;
        }
        Song newSong = new Song(songTitle, songDuration);
        songs.add(newSong);
        return true;
    }

    private Song findSong(String title)
    {
        for (int i=0 ; i<songs.size() ; i++)
        {
            Song currentSong = songs.get(i);
            if (currentSong.getTitle().equals(title))
            {
                return currentSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist)
    {
        Song song = findSong(songTitle);
        if (song == null) return false;
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist)
    {
        if (trackNumber <= 0) return false;
        Song song = songs.get(trackNumber-1);
        playlist.add(song);
        return true;
    }
}
