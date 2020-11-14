package game;

/**
 * 
 * @author xavier
 * @version 2.0
 *
 */
public class Game {

	private Player player1;
	private Player player2;
	private int turn;
	private Cursor cursor;
	private int screen;
	private boolean isPlaying;
	
	public Game() {
		this.player1 = new PlayerHUM();
		this.player2 = new PlayerCPU();
		this.turn = 0;
		this.cursor = new Cursor(0, 0);
		this.screen = 0;
		this.isPlaying = true;
	}

	public void updateCursorDimensions() {
		
	}
	
	public int getScreen() {
		return this.screen;
	}
	
	public void readInput() {
		
	}
	
	public void printScreen(int screem) {
		switch(screen) {
			case 0:
				this.printMenuScreen();
				break;				
			case 1:
				this.printSelectionScreen();
				break;
			case 2:
				this.printBoardScreen();
				break;
			default:
		}
	}
	
	public void endGame() {
		this.isPlaying = false;
	}
	
	public boolean isPlaying() {
		return this.isPlaying;
	}
	
	private void printMenuScreen() {
		
	}
	
	private void printSelectionScreen() {
		
	}
	
	private void printBoardScreen() {
		
	}
}
