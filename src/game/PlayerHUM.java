package game;
import java.util.*;
import java.io.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.lang.String;

/**
 * @author desirée
 * @version 1.1
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
  
  //It's necessary create Exception class!
  public void playTurn(int posX,int posY) {
    //Missing read arrows and enter.

    //Condition ENTER_KEY:

    //within the condition:
    //We put the calls to the functions later.


  }
  public void updateBoardCell(int posX,int posY,Cell cell) {
    //if(posY < cell.length - 1){
    //if(posX < cell.length[posY] - 1){
    //Missed thing but i don't understand this correctly.
    //}
    //}
  }
  public boolean checkWinCondition() {
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
}

