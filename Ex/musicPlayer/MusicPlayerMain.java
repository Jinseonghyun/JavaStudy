package musicPlayer;

public class MusicPlayerMain {

	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
		
		player.on();
		
		player.volumUp();

		player.volumUp();
		
		player.volumeDown();
		
		player.showStatus();
		
		player.off();

	}

}
