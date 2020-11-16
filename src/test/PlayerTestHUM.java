package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.PlayerHUM;

/**
 *
 * @author desirée
 * @version 1.3
 *
 */
class PlayerTestHUM {
  @Test
  void TestCheckWinPositivePlayer2(){
    //Given
    PlayerHUM playerHUM = new PlayerHUM();
    int boatsCount = 5;

    //When
    boolean winner =  playerHUM.checkWinCondition(boatsCount);
    //Then
    assertEquals(true,winner);
  }

  @Test
  void TestCheckWinNegativePlayer2(){
    //Given
    PlayerHUM playerHUM = new PlayerHUM();
    int boatsCount = 2;

    //When
    boolean winner = playerHUM.checkWinCondition(boatsCount);
    //Then
    assertEquals(false,winner);
  }

  @Test
  void TestCheckWinNegativePlayer2BiggerValue(){
    //Given
    PlayerHUM playerHUM = new PlayerHUM();
    int boatsCount = 2;

    //When
    boolean winner = playerHUM.checkWinCondition(boatsCount);
    //Then
    assertEquals(false,winner);
  }

  @Test
  void TestUpdateBoardCellNotHitAtFirstPlayer2() {
    //Given
    PlayerHUM playerHUM = new PlayerHUM();
    int posX = 4;
    int posY = 5;

    //When
    playerHUM.updateBoardCell(posX, posY, playerHUM.getBoard().getCell(posX, posY));

    //Then
    assertEquals(true,playerHUM.getBoard().getCell(posX, posY).ishit());
  }
  @Test
  void TestUpdateBoardCelliHitAtFirstPlayer2() {
    //Given
    PlayerHUM playerHUM = new PlayerHUM();

    int posX = 4;
    int posY = 5;

    //When
    playerHUM.getBoard().getCell(posX, posY).hit();
    playerHUM.updateBoardCell(posX, posY, playerHUM.getBoard().getCell(posX, posY));
    //Then
    assertEquals(true,playerHUM.getBoard().getCell(posX, posY).ishit());
  }
  @Test
  void TestPlayTurnNotHitPlayer2() {
    //Given

    int posX = 3;
    int posY = 5;

    PlayerHUM playerHUM = new PlayerHUM();
    //When
    playerHUM.playTurn(posX, posY);
    //Then
    assertEquals(true,playerHUM.getBoard().getCell(posX,posY).ishit());
  }

  @Test
  void TestPlayTurnHitPlayer2() {
    //Given
    PlayerHUM playerHUM = new PlayerHUM();
    int posX = 3;
    int posY = 4;

    //When
    playerHUM.getBoard().getCell(posX, posY).hit();
    playerHUM.playTurn(posX, posY);

    //Then
    assertEquals(true,playerHUM.getBoard().getCell(posX,posY).ishit());
  }

}