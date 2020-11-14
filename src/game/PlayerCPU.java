package game;
import java.util.*;
import java.io.*;


/**
 * @author desirée
 * @version 1.5
 */

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
  private Game game;
  public PlayerCPU(){
    this.boatsStatus = new BoatsStatus();
    this.cursor = new Cursor();
    this.board = new Board();
    this.boatsCount = 0;
    this.aliveCarrier = true;
    this.aliveBattleship = true;
    this.aliveCruiser = true;
    this.aliveSubmarine = true;
    this.aliveDestroyer = true;
    this.game = new Game();
  }

  //It's necessary create Exception class!
  public void playTurn(int posX,int posY) throws Exception{

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
    this.checkWinCondition();
    game.changePlayerTurn();

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
