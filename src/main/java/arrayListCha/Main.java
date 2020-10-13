package arrayListCha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Storm","Depp");
        album.addSong("ssss",4.9);
        album.addSong("bbbb",2.0);
        album.addSong("hhhh",9.0);
        album.addSong("tttt",2.9);

        albums.add(album);

        album = new Album("drr","AC");
        album.addSong("ss",2.9);
        album.addSong("ssqqq",4.9);
        album.addSong("www",3.0);
        album.addSong("eee",2.6);
        albums.add(album);

        LinkedList<Song> playlist =  new LinkedList<>();
        albums.get(0).addToPlayList("ssss",playlist);
        albums.get(3).addToPlayList("tttt",playlist);
        albums.get(0).addToPlayList("notexist",playlist);

        play(playlist);


    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing "+listIterator.next().toString());
        }
    }
}
