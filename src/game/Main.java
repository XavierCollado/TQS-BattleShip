package game;

/**
 * 
 * @author xavier
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		Cursor cursorMenu = new Cursor(1, 2);
		Cursor cursorBoard = new Cursor(10, 10);
		
		// Main game loop
		while(game.isPlaying()) {
			game.printScreen(game.getScreen());
		}
	}

}
