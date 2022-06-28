package TabliceISterowanie.Playlista;

public class PlayListTest {
    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 309);
        Song song2 = new Song("Nothing else matters", 300);
        int playlistLength = PlayList.playlistLength(song1, song2);
        System.out.printf("wszystkie piosenki trwaja %d sekund, czyli ", playlistLength);
        System.out.println(PlayList.getFormattedTime(playlistLength));
        System.out.printf("wszystkie piosenki trwaja %d sekund, czyli ", playlistLength);
        System.out.println(PlayList.getFormattedTime2(playlistLength));
    }
}
