package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import game.PlayerCPU;
import game.Board;
import game.Cell;
/**
 *
 * @author desirée
 * @version 1.3
 *
 */
class PlayerTestCPU {

  @Test
  void TestPlayTurnNotHit() {
    //Given

    int posX = 3;
    int posY = 5;
    String type = "";
    int gameScreenId = 3;
    PlayerCPU playerCPU = new PlayerCPU();
    //When
    playerCPU.playTurn(posX, posY);
    //Then
    assertEquals(true,playerCPU.getBoard().getCell(posX,posY).ishit());
  }

  @Test
  void TestPlayTurnHit() {
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 3;
    int posY = 4;
    int gameScreenId = 3;
    //When
    playerCPU.getBoard().getCell(posX, posY).hit();
    playerCPU.playTurn(posX, posY);

    //Then
    assertEquals(true,playerCPU.getBoard().getCell(posX,posY).ishit());
  }
  @Test
  void TestUpdateBoardCellisntHitAtFirst() {
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 4;
    int posY = 5;

    //When
    playerCPU.updateBoardCell(posX, posY, playerCPU.getBoard().getCell(posX, posY));

    //Then
    assertEquals(true,playerCPU.getBoard().getCell(posX, posY).ishit());
  }
  @Test
  void TestUpdateBoardCelliHitAtFirst() {
    //Given
    PlayerCPU playerCPU = new PlayerCPU();

    int posX = 4;
    int posY = 5;

    //When
    playerCPU.getBoard().getCell(posX, posY).hit();
    playerCPU.updateBoardCell(posX, posY, playerCPU.getBoard().getCell(posX, posY));
    //Then
    assertEquals(true,playerCPU.getBoard().getCell(posX, posY).ishit());
  }
  @Test
  void TestCheckWinPositive(){
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int boatsCount = 5;

    //When
    boolean winner =  playerCPU.checkWinCondition(boatsCount);
    //Then
    assertEquals(true,winner);
  }

  @Test
  void TestCheckWinNegative(){
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int boatsCount = 2;

    //When
    boolean winner = playerCPU.checkWinCondition(boatsCount);
    //Then
    assertEquals(false,winner);
  }

}