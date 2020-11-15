package game;

import java.util.Scanner;

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
	private int screen;
	private boolean isPlaying;
	private String screenMessage;
	private Scanner inpuntScanner;
	
	public Game() {
		this.player1 = new PlayerHUM();
		this.player2 = new PlayerCPU();
		this.turn = 0;
		this.screen = 0;
		this.isPlaying = true;
		this.screenMessage = "║ Select a valid option                           ║\n"+ "║                                                 ║\n";
		this.inpuntScanner = new Scanner(System.in);
	}

	public void updateCursorDimensions(int dimX, int dimY) {
		
	}
	
	public int getScreen() {
		return this.screen;
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
		System.out.print("╔═════════════════════════════════════════════════╗\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                   BATTLESHIPS                   ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "╠═════════════════════════════════════════════════╣\n"
				+ "║                                                 ║\n"
				+ "║  1) Single Player                               ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║                                                 ║\n"
				+ "║  2) Exit Game                                   ║\n"
				+ "║                                                 ║\n"
				+ "╠═════════════════════════════════════════════════╣\n"
				+ this.screenMessage
				+ "╚═════════════════════════════════════════════════╝\n"
				+ "");
	}
	
	private void printSelectionScreen() {
		
	}
	
	private void printBoardScreen() {
		
	}
	
	public void readInput() {
		String s = inpuntScanner.nextLine();
		applyAction(s);
	}
	
	private void applyAction(String input) {
		String response = input;
		if(this.screen == 0) {
			if(response.equals("1")) {
				this.screenMessage = "║ You add a valid option :)                       ║\n"+"║                                                 ║\n";
			} else {
				this.screenMessage = "║ Please add a valid option (just the number)     ║\n"+"║                                                 ║\n";
			}
		}
	}
}
