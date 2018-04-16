import KaraokeMachine;
import Song;
import SongBook;

public class Karaoke {
  
  public static void main(String[] args) {
   SongBook songBook = new SongBook();
    songBook.importFrom("songs.txt");
    KaraokeMachine machine = new KaraokeMachine(songBook);
    machine.run();
    System.out.println("Saving changes...");
    songBook.exportTo("songs.txt");
	//replace 'songs.txt' with a file name containing song names//
  }
}
