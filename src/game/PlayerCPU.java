package game;
import java.util.*;
import java.io.*;
/**
 * @author desirée
 * @version 1.2
 */
//we should put Cursor cursor (we use posX, posY) and also Cell cell (we use cell) ??
public class PlayerCPU implements Player{
  private BoatsStatus boatsStatus;
  private Board board;
  private int boatsCount;
  private boolean aliveCarrier;
  private boolean aliveBattleship;
  private boolean aliveCruiser;
  private boolean aliveSubmarine;
  private boolean aliveDestroyer;
  private boolean isWin;
  private Cursor cursor;
  public PlayerCPU(){
    this.boatsStatus = new BoatsStatus();
    this.cursor = new Cursor();
    this.board = new Board();
    this.cursor = new Cursor();
    this.boatsCount = 0;
    this.aliveCarrier = true;
    this.aliveBattleship = true;
    this.aliveCruiser = true;
    this.aliveSubmarine = true;
    this.aliveDestroyer = true;
  }

  public void playTurn(int posX,int posY,int torn) throws Exception{
    if(torn == 0) {
      if (posX < 0) {
        throw new Exception("posX or posY out of board.");
      }
      if (posY < 0) {
        throw new Exception("posX or posY out of board.");
      }
      if (posX > 9) {
        throw new Exception("posX or posY out of board.");
      }
      if (posY > 9) {
        throw new Exception("posX or posY out of board.");
      }
      //Missing read arrows and enter.
      //Loop where we look characters read.
      //condition DOWN_KEY:

      //within the condition:
      if (posY > 0) {
        cursor.setPosY(--posY);
      }
      //Condition UP_KEY:

      //within the condition:
      if (posY < 9) {
        cursor.setPosY(++posY);
      }

      //Condition LEFT_KEY:

      //within the condition:
      if (posX > 0) {
        cursor.setPosX(--posX);
      }

      //Condition RIGHT_KEY:

      //within the condition:
      if (posX < 9) {
        cursor.setPosX(++posX);
      }
      //Condition ENTER_KEY:

      //within the condition:
      //We put the calls to the functions later.
    }
  }
  private void updateBoardCell(int posX,int posY,Cell cell) throws Exception{
      if(posX < 0){
        throw new Exception("posX or posY out of board.");
      }
      if(posY < 0){
        throw new Exception("posX or posY out of board.");
      }
      if(posX > 9){
        throw new Exception("posX or posY out of board.");
      }
      if(posY > 9){
        throw new Exception("posX or posY out of board.");
      }
      //if(posY < cell.length - 1){
        //if(posX < cell.length[posY] - 1){
          //Missed thing but i don't understand this correctly.
        //}
      //}
  }
  private boolean checkWinCondition() {

    boolean win = false;
    if(boatsCount == 5){
      win = true;
    }
    return this.win;
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
