package game;

import java.util.Scanner;
import game.CellConstants;

/**
 * 
 * @author xavier
 * @version 3.0
 *
 */
public class Game {

	public Player player1;
	public Player player2;
	private int turn;
	private int screen;
	private boolean isPlaying;
	private String screenMessageTop;
	private String screenMessageDown;
	private Scanner inpuntScanner;
	private int boatInsertId;
	
	public Game() {
		this.player1 = new PlayerHUM();
		this.player2 = new PlayerCPU();
		this.turn = 0;
		this.screen = 0;
		this.isPlaying = true;
		this.screenMessageTop = "║ Select a valid option                              ║\n";
		this.screenMessageDown = "║                                                    ║\n";
		this.inpuntScanner = new Scanner(System.in);
		this.boatInsertId = 0;
	}
	
	public int getScreen() {
		return this.screen;
	}
	
	public void printScreen(int screenId) {
		switch(screenId) {
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

	public String readInput() {
		String input = inpuntScanner.nextLine();
		return input;
	}
	
	public void applyAction(String input) {
		String response = input;
		// Actions for MenuScreen
		if(this.screen == 0) {
			menuScreenAction(response);
		}
		
		//Actions for SelectionScreen
		if(this.screen == 1) {
			selectionScreenAction(response);
		}
		
		//Actions for BoardScreen
		if(this.screen == 2) {
			boardScreenAction(response);
		}
	}
	
	public boolean isPlaying() {
		return this.isPlaying;
	}
	
	public int getBoatInsertId() {
		return boatInsertId;
	}
	
	private void endGame() {
		this.isPlaying = false;
	}
	
	private void printMenuScreen() {
		System.out.print("╔════════════════════════════════════════════════════╗\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                   BATTLESHIPS                      ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "╠════════════════════════════════════════════════════╣\n"
				+ "║                                                    ║\n"
				+ "║  1) Single Player                                  ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║                                                    ║\n"
				+ "║  2) Exit Game                                      ║\n"
				+ "║                                                    ║\n"
				+ "╠════════════════════════════════════════════════════╣\n"
				+ this.screenMessageTop
				+ this.screenMessageDown
				+ "╚════════════════════════════════════════════════════╝\n"
				+ "");
	}
	
	private void printSelectionScreen() {
		System.out.print("╔════════════════════════════════════════════════════╗\n"
				+ "║ <RULES>                                            ║\n"
				+ "║                                                    ║\n"
				+ "║ · Now you need to setUp your boats starting with   ║\n"
				+ "║   the Carrier until the Destroyer                  ║\n"
				+ "║ · This selection will be done by 3 inputs:         ║\n"
				+ "║   [posX] [posY] [horientation]                     ║\n"
				+ "║ · The boat will be set from left to wright (H) or  ║\n"
				+ "║   from up to down (V)                              ║\n"
				+ "║ · A boat cannot touch another boat                 ║\n"
				+ "║                                                    ║\n"
				+ "║   Valid input example: 2 3 H   or   4 3 V          ║\n"
				+ "╠═══════════════════════════════════╦════════════════╣\n"
				+ "║     1  2  3  4  5  6  7  8  9  10 ║                ║\n"
				+ "║ 1  "+getSelectionRow(0)+" ║                ║\n"
				+ "║ 2  "+getSelectionRow(1)+" ║                ║\n"
				+ "║ 3  "+getSelectionRow(2)+" ║ Carrier (5)    ║\n"
				+ "║ 4  "+getSelectionRow(3)+" ║ Battleship (4) ║\n"
				+ "║ 5  "+getSelectionRow(4)+" ║ Cruiser (3)    ║\n"
				+ "║ 6  "+getSelectionRow(5)+" ║ Submarine (2)  ║\n"
				+ "║ 7  "+getSelectionRow(6)+" ║ Destroyer (2)  ║\n"
				+ "║ 8  "+getSelectionRow(7)+" ║                ║\n"
				+ "║ 9  "+getSelectionRow(8)+" ║                ║\n"
				+ "║ 10 "+getSelectionRow(9)+" ║                ║\n"
				+ "╠═══════════════════════════════════╩════════════════╣\n"
				+ this.screenMessageTop
				+ this.screenMessageDown
				+ "╚════════════════════════════════════════════════════╝");
		
	}
	
	private void printBoardScreen() {
		
	}
	
	private void setMenuScreen() {
		this.screen = 0;
	}
	
	private void setSelectionScreen() {
		this.screen = 1;
	}
	
	private void setBoardScreen() {
		this.screen = 2;
	}
	
	private String getSelectionRow(int posY) {
		char cellChar;
		String cellRow = "";
		for(int i = 0; i<10; i++) {
			if(player1.getCellType(i, posY) == CellConstants.WATER_TYPE) {
				cellChar = CellConstants.WATER_CHAR;
			} else {
				cellChar = CellConstants.BOAT_CHAR;
			}
			cellRow = cellRow + "["+cellChar+"]";
		}
		return cellRow;
	}
	
	private void menuScreenAction(String input) {
		if(input.equals("1")) {
			setSelectionScreen();
			this.screenMessageTop = "║ Select a valid option                              ║\n";
			this.screenMessageDown = "║                                                    ║\n";
		} else if (input.equals("2")) {
			this.screenMessageTop = "║ BYE BYE :)                                         ║\n";
			this.screenMessageDown = "║                                                    ║\n";
			endGame();
		}
		else {
			this.screenMessageTop = "║ Please add a valid option (just the number)        ║\n";
			this.screenMessageDown = "║                                                    ║\n";
		}
	}
	
	private void selectionScreenAction(String input) {
		String[] params = input.split(" ", 3);
		//int posX = params[0];
		//int posY = params[1];
		String orientation = params[2];
		
		//Validate posX
		if(params[0]=="") {
			
		}
		//Validate posY
		if(params.length>1) {
			if(params[1]=="") {
				
			}
		}
		//Validate orientation
		if(params.length>2) {
			if(params[2]=="") {
				
			}
		}
	}
	
	private void boardScreenAction(String input) {
		
	}
}
