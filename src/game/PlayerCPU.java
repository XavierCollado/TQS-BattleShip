package game;
import java.util.*;
import java.io.*;

import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.lang.String;
/**
 * @author desirée
 * @version 1.4
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
  @Override
  public String keyReleased(int posX,int posY,KeyEvent e) {
    // New key press
    int key = e.getKeyCode();
    // If we press right
    if (key == KeyEvent.VK_RIGHT) {
      if (posX < 9) {
        cursor.setPosX(++posX);
      }
    } else if (key == KeyEvent.VK_LEFT) {
      if (posX > 0) {
        cursor.setPosX(--posX);
      }
    }else if(key == KeyEvent.VK_DOWN){
      if (posY > 0) {
        cursor.setPosY(--posY);
      }
    }else if(key == KeyEvent.VK_UP){
      if (posY < 9) {
        cursor.setPosY(++posY);
      }
    }
    else if(key == KeyEvent.VK_ENTER){
      //Change!!!!
      if (posY < 9) {
        cursor.setPosY(++posY);
      }
    }
  }

  @Override
  public void keyTyped(int posX,int posY,KeyEvent e) {
    // New key press
    int key = e.getKeyCode();
    // If we press right
    if (key == KeyEvent.VK_RIGHT) {
      if (posX < 9) {
        cursor.setPosX(++posX);
      }
    } else if (key == KeyEvent.VK_LEFT) {
      if (posX > 0) {
        cursor.setPosX(--posX);
      }
    }else if(key == KeyEvent.VK_DOWN){
      if (posY > 0) {
        cursor.setPosY(--posY);
      }
    }else if(key == KeyEvent.VK_UP){
      if (posY < 9) {
        cursor.setPosY(++posY);
      }
    }else if(key == KeyEvent.VK_ENTER){
      //Change!!!!
      if (posY < 9) {
        cursor.setPosY(++posY);
      }
    }
  }
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
    //Missing read arrows and enter.

    //Condition ENTER_KEY:

    //within the condition:
    //We put the calls to the functions later.

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
