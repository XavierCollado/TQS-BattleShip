package game;
import java.util.*;
import java.io.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.lang.String;

/**
 * @author desirée & xavier
 * @version 1.3
 */

public class PlayerHUM implements Player{
  private Board board, enemyBoard;
  private int boatsCount;
  private boolean aliveCarrier;
  private boolean aliveBattleship;
  private boolean aliveCruiser;
  private boolean aliveSubmarine;
  private boolean aliveDestroyer;
  private boolean isWin;
  
  public PlayerHUM(){
    this.board = new Board();
    this.enemyBoard = new Board();
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
  
  public void playTurn(int posX,int posY) {
	  if(board.getCell(posX,posY).ishit()==false) {
	      board.getCell(posX,posY).hit();
	  }
  }
  
  public void updateBoardCell(int posX,int posY,Cell cell) {
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
  
  public void setEnemyBoard(Board newEnemyBoard) {
	  this.enemyBoard = newEnemyBoard;
  }
}
