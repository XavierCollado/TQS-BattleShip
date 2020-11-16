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
  public int randomX(String shipType) {
    Random random = new Random();
    int result = random.nextInt(10);
    
    if(shipType == CellConstants.CARRIER_TYPE) {
    	result = random.nextInt(4 - 0 + 1);
    } else if(shipType == CellConstants.BATTLESHIP_TYPE) {
    	result = random.nextInt(6 - 0 + 1);
    } else if(shipType == CellConstants.CRUISER_TYPE) {
    	result = random.nextInt(7 - 0 + 1);
    } else if(shipType == CellConstants.SUBMARINE_TYPE) {
    	result = random.nextInt(8 - 0 + 1);
    } else if(shipType == CellConstants.DESTROYER_TYPE) {
    	result = random.nextInt(8 - 0 + 1);
    } 
    
    return result;
  }
  public int randomY() {
    Random random = new Random();
    int result = random.nextInt(10);
    return result;
  }
  
  public Board getEnemyBoard() {
	  return this.enemyBoard;
  }
  
  public void playTurn(int posX,int posY){
	  enemyBoard.getCell(posX,posY).hit();
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
	
	public int getBoatsSelectionId() {
		return this.boatsSelectionId;
	}

	public boolean isCellHit(int posX, int posY) {
		return board.getCell(posX, posY).ishit();
	}
	
	private void initializeCPUBoard_Carrier() {
		int posX = randomX(CellConstants.CARRIER_TYPE);
		int posY = 1;
		char orientation = 'H'; //Pending to randomize the H / V selection
		int shipLenght = 0;
		
		shipLenght = 5;
		if((orientation == 'H') && (posX <= (10 - shipLenght-1))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(i+posX, 1, new Cell(i+posX, 1, CellConstants.CARRIER_TYPE));
					this.boatsSelectionId = 1;
				}
			}
		} else if((orientation == 'V') && (posY < (10 - shipLenght-1))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(posX, i+posY, new Cell(posX, i+posY, CellConstants.CARRIER_TYPE));
					this.boatsSelectionId = 1;
				}
			}
		}
	}
	
	private void initializeCPUBoard_Battleship() {
		int posX = randomX(CellConstants.BATTLESHIP_TYPE);
		int posY = 3;
		char orientation = 'H'; //Pending to randomize the H / V selection
		int shipLenght = 0;
		
		shipLenght = 4;
		if((orientation == 'H') && (posX <= (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(i+posX, 3, new Cell(i+posX, 3, CellConstants.BATTLESHIP_TYPE));
					this.boatsSelectionId= 2;
				}
			}
		} else if((orientation == 'V') && (posY < (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(posX, i+posY, new Cell(posX, i+posY, CellConstants.BATTLESHIP_TYPE));
					this.boatsSelectionId = 2;
				}
			}
		}
	}
	
	private void initializeCPUBoard_Cruiser() {
		int posX = randomX(CellConstants.CRUISER_TYPE);
		int posY = 5;
		char orientation = 'H'; //Pending to randomize the H / V selection
		int shipLenght = 0;
		
		shipLenght = 3;
		if((orientation == 'H') && (posX <= (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(i+posX, 5, new Cell(i+posX, 5, CellConstants.CRUISER_TYPE));
					this.boatsSelectionId = 3;
				}
			}
		} else if((orientation == 'V') && (posY < (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(posX, i+posY, new Cell(posX, i+posY, CellConstants.CRUISER_TYPE));
					this.boatsSelectionId = 3;
				}
			}
		}
	}
	
	private void initializeCPUBoard_Submarine() {
		int posX = randomX(CellConstants.SUBMARINE_TYPE);
		int posY = 7;
		char orientation = 'H'; //Pending to randomize the H / V selection
		int shipLenght = 0;
		
		shipLenght = 2;
		if((orientation == 'H') && (posX <= (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(i+posX, 7, new Cell(i+posX, 7, CellConstants.SUBMARINE_TYPE));
					this.boatsSelectionId = 4;
				}
			}
		} else if((orientation == 'V') && (posY < (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(posX, i+posY, new Cell(posX, i+posY, CellConstants.SUBMARINE_TYPE));
					this.boatsSelectionId = 4;
				}
			}
		}
	}
	
	private void initializeCPUBoard_Destroyer() {
		int posX = randomX(CellConstants.DESTROYER_TYPE);
		int posY = 9;
		char orientation = 'H'; //Pending to randomize the H / V selection
		int shipLenght = 0;
		
		shipLenght = 2;
		if((orientation == 'H') && (posX <= (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(i+posX, 9, new Cell(i+posX, 9, CellConstants.DESTROYER_TYPE));
					this.boatsSelectionId = 5;
				}
			}
		} else if((orientation == 'V') && (posY < (10 - shipLenght))) {
			if(isAValidPosition(posX, posY, orientation, shipLenght)) {
				for(int i=0; i<shipLenght; i++) {
					this.updateBoardCell(posX, i+posY, new Cell(posX, i+posY, CellConstants.DESTROYER_TYPE));
					this.boatsSelectionId = 5;
				}
			}
		}
	}
	
	public void initializeCPUBoard() {
		initializeCPUBoard_Carrier();
		initializeCPUBoard_Battleship();
		initializeCPUBoard_Cruiser();
		initializeCPUBoard_Submarine();
		initializeCPUBoard_Destroyer();
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