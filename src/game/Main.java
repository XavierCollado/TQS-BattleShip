package game;

/**
 * 
 * @author xavier
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		
		// Main game loop
		while(game.isPlaying()) {
			game.printScreen(game.getScreen());
		}
	}

}
