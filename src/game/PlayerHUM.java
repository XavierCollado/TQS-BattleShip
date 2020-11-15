package game;
import java.util.*;
import java.io.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.lang.String;

/**
 * @author desirée
 * @version 1.3
 */

public class PlayerHUM implements Player{
  private Board board;
  private int boatsCount;
  private boolean aliveCarrier;
  private boolean aliveBattleship;
  private boolean aliveCruiser;
  private boolean aliveSubmarine;
  private boolean aliveDestroyer;
  private boolean isWin;
  
  public PlayerHUM(){
    this.board = new Board();
    this.boatsCount = 0;
    this.aliveCarrier = true;
    this.aliveBattleship = true;
    this.aliveCruiser = true;
    this.aliveSubmarine = true;
    this.aliveDestroyer = true;
  }
  public Board getBoard() {
    return board;
  }
  //It's necessary create Exception class!
  public void playTurn(int posX,int posY, int screen) {
    if(screen == 0) {

    }
    else if(screen == 1) {

    }
    //Missing read arrows and enter.

    //Condition ENTER_KEY:

    //within the condition:
    //We put the calls to the functions later.


  }
  public void updateBoardCell(int posX,int posY,Cell cell) {
    if(board.getCell(posX, posY).ishit() == false) {
      this.playTurn(posX,posY, 2);
      board.getCell(posX, posY).hit();
    }
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
}
