package game;
import java.util.*;
import java.io.*;


/**
 * @author desirée
 * @version 1.6
 */

public class PlayerCPU implements Player{
  private Board board;
  private int boatsCount;
  private boolean aliveCarrier;
  private boolean aliveBattleship;
  private boolean aliveCruiser;
  private boolean aliveSubmarine;
  private boolean aliveDestroyer;
  private boolean isWin;

  public PlayerCPU(){
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
    this.checkWinCondition(boatsCount);
  }

  public void updateBoardCell(int posX,int posY,Cell cell){
    if(board.getCell(posX, posY).ishit() == false) {
      this.playTurn(posX,posY);
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
}