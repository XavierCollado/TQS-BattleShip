package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import game.PlayerCPU;
import game.Board;
import game.Cell;
/**
 *
 * @author desirée
 * @version 1.2
 *
 */
class PlayerTestCPU {

  @Test
  public void TestPlayTurnNotHit() {
    //Given

    int posX = 3;
    int posY = 4;
    String type = "";

    PlayerCPU playerCPU = new PlayerCPU();

    playerCPU.playTurn(posX, posY);

    assertEquals(true,playerCPU.getBoard().getCell(posX,posY).ishit());
  }

  @Test
  public void TestPlayTurnHit() {
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 3;
    int posY = 4;
    playerCPU.playTurn(posX, posY);
    playerCPU.getBoard().getCell(posX, posY).hit();
    assertEquals(true,playerCPU.getBoard().getCell(posX,posY).ishit());
  }
  @Test
  public void TestUpdateBoardCellisntHitAtFirst() {
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 4;
    int posY = 5;

    //When
    //playerCPU.updateBoardCell(posX, posY, playerCPU.getBoard().getCell(posX, posY));

    //Then
    //assertEquals(true,isHitCel);
  }
  @Test
  public void TestUpdateBoardCelliHitAtFirst() {
    //Given
    PlayerCPU playerCPU = new PlayerCPU();

    int posX = 4;
    int posY = 5;

    //When
    //playerCPU.updateBoardCell(posX, posY, board.getCell(posX, posY));
    // boolean isHitCel = board.getCell(posX, posY).ishit();
    //Then
    //assertEquals(true,isHitCel);
  }
  @Test
  public void TestCheckWinPositive(){
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int boatsCount = 5;

    //When
    boolean winner =  playerCPU.checkWinCondition(boatsCount);
    //Then
    assertEquals(true,winner);
  }

  @Test
  public void TestCheckWinNegative(){
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int boatsCount = 2;

    //When
    boolean winner = playerCPU.checkWinCondition(boatsCount);
    //Then
    assertEquals(false,winner);
  }

}