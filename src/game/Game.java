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
	
	public void readInput() {
		
	}
	
	public void printScreen() {
		
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
