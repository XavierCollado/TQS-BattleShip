package game;
import java.util.*;
import java.io.*;


/**
 * @author desirée & xavier
 * @version 1.6
 */

public class PlayerCPU implements Player{
  private Board board, enemyBoard;
  private int boatsCount;
  private boolean aliveCarrier;
  private boolean aliveBattleship;
  private boolean aliveCruiser;
  private boolean aliveSubmarine;
  private boolean aliveDestroyer;
  private boolean isWin;
  private int boatsSelectionId;

  public PlayerCPU(){
    this.board = new Board();
    this.enemyBoard = new Board();
    this.boatsCount = 0;
    this.aliveCarrier = true;
    this.aliveBattleship = true;
    this.aliveCruiser = true;
    this.aliveSubmarine = true;
    this.aliveDestroyer = true;
    boatsSelectionId = 0;
  }
  public Board getBoard() {
    return board;
  }
  public int randomX() {
    Random random = new Random();
    int result = random.nextInt(9 - 0 + 1);
    return result;
  }
  public int randomY() {
    Random random = new Random();
    int result = random.nextInt(9 - 0 + 1);
    return result;
  }
  
  public void playTurn(int posX,int posY){
    if(board.getCell(posX,posY).ishit()==false) {
      board.getCell(posX,posY).hit();
    }
  }

  public void updateBoardCell(int posX,int posY,Cell cell){
	  board.updateCell(posX, posY, cell);
  }

  public boolean checkWinCondition(int boatsCount) {
    boolean win = false;
    if(boatsCount == 5){
      win = true;
    }
    return win;
  }

  public boolean isCarrierAlive(){
    return aliveCarrier;
  }

  public boolean isBattleshipAlive(){
    return aliveBattleship;
  }

  public boolean isCruiserAlive(){
    return aliveCruiser;
  }

  public boolean isSubmarineAlive(){
    return aliveSubmarine;
  }

  public boolean isDestroyerAlive(){
    return aliveDestroyer;
  }
  
	public String getCellType(int posX, int posY) {
		return board.getCell(posX, posY).getType();
	}

	public boolean isCellHit(int posX, int posY) {
		return board.getCell(posX, posY).ishit();
	}
	
	public void initialitzeCPUBoard() {
		int boatCountId = this.boatsSelectionId;
		int boardPosX = randomX();
		int boardPosY = randomY();
		char orientation = 'H'; //Pending to randomize the H / V selection
		int shipLenght;
		int matrixPosX = boardPosX, matrixPosY = boardPosY;
		switch(boatCountId) {
			// Carrier
			case 0:
				shipLenght = 5;
				if((orientation == 'H') && (boardPosX <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(i+matrixPosX, matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.CARRIER_TYPE));
							this.boatsSelectionId = 1;
						}
					}
				} else if((orientation == 'V') && (boardPosY <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(matrixPosX, i+matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.CARRIER_TYPE));
							this.boatsSelectionId = 1;
						}
					}
				}
				break;
			//Battleship
			case 1:
				shipLenght = 4;
				if((orientation == 'H') && (boardPosX <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(i+matrixPosX, matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.BATTLESHIP_TYPE));
							this.boatsSelectionId= 2;
						}
					}
				} else if((orientation == 'V') && (boardPosY <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(matrixPosX, i+matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.BATTLESHIP_TYPE));
							this.boatsSelectionId = 2;
						}
					}
				}
				break;
			//Cruiser
			case 2:
				shipLenght = 3;
				if((orientation == 'H') && (boardPosX <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(i+matrixPosX, matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.CRUISER_TYPE));
							this.boatsSelectionId = 3;
						}
					}
				} else if((orientation == 'V') && (boardPosY <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(matrixPosX, i+matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.CRUISER_TYPE));
							this.boatsSelectionId = 3;
						}
					}
				}
				break;
			//Submarine
			case 3:
				shipLenght = 2;
				if((orientation == 'H') && (boardPosX <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(i+matrixPosX, matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.SUBMARINE_TYPE));
							this.boatsSelectionId = 4;
						}
					}
				} else if((orientation == 'V') && (boardPosY <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(matrixPosX, i+matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.SUBMARINE_TYPE));
							this.boatsSelectionId = 4;
						}
					}
				}
				break;
			//Destroyer
			case 4:
				shipLenght = 2;
				if((orientation == 'H') && (boardPosX <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(i+matrixPosX, matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.DESTROYER_TYPE));
							this.boatsSelectionId = 5;
						}
					}
				} else if((orientation == 'V') && (boardPosY <= (10 - shipLenght))) {
					if(isAValidPosition(matrixPosX, matrixPosY, orientation, shipLenght)) {
						for(int i=0; i<shipLenght; i++) {
							this.updateBoardCell(matrixPosX, i+matrixPosY, new Cell(matrixPosX, matrixPosY, CellConstants.DESTROYER_TYPE));
							this.boatsSelectionId = 5;
						}
					}
				}
				break;
			default:
				break;
		}
	}
	
	private boolean isAValidPosition(int matrixPosX, int matrixPosY, char orientation, int lenght) {
		boolean valid = true;
		if(orientation == 'H') {
			for(int tempMatrixPosX=matrixPosX-1; tempMatrixPosX<lenght+2; tempMatrixPosX++) {
				for(int tempMatrixPosY=matrixPosY-1; tempMatrixPosY<matrixPosY+2; tempMatrixPosY++) {
					if((tempMatrixPosX < 10) && (tempMatrixPosY < 10) && (tempMatrixPosX >= 0) && (tempMatrixPosY >= 0)) {
						if(this.getCellType(tempMatrixPosX, tempMatrixPosY) != CellConstants.WATER_TYPE) {
							valid = false;
						}
					}
				}
			}
		} else if(orientation == 'V') {
			for(int tempMatrixPosX=matrixPosX-1; tempMatrixPosX<matrixPosX+2; tempMatrixPosX++) {
				for(int tempMatrixPosY=matrixPosY-1; tempMatrixPosY<lenght+2; tempMatrixPosY++) {
					if((tempMatrixPosX < 10) && (tempMatrixPosY < 10) && (tempMatrixPosX >= 0) && (tempMatrixPosY >= 0)) {
						if(this.getCellType(tempMatrixPosX, tempMatrixPosY) != CellConstants.WATER_TYPE) {
							valid = false;
						}
					}
				}
			}
		}
		return valid;
	}

	public void setEnemyBoard(Board newEnemyBoard) {
		this.enemyBoard = newEnemyBoard;
	}
}