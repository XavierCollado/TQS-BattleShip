package game;

/**
 * 
 * @author xavier
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		String input;
		
		// Main game loop
		game.printScreen(game.getScreen());
		while(game.isPlaying()) {
			input = game.readInput();
			game.applyAction(input);
			game.printScreen(game.getScreen());
		}
	}

}
