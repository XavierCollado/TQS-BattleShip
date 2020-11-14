package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.PlayerCPU;

/**
 * 
 * @author desirée
 * @version 1.1
 *
 */
class PlayerTestCPU {
  //Test exceptions
  //@Test
  //public void testThrows()
  //{
    //RuntimeException e = expectException( RuntimeException.class, () ->
    //{
      //throw new RuntimeException( "fail!" );
    //} );
    //assert e.getMessage().equals( "fail!" );
  //}
  @Test
  public void TestException_posXBigger(){
    //Given

    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 11;
    int posY = 3;
    int turn = 1;

    //Then
    assertEquals(playerCPU.playTurn(posX,posY,turn),OutOfBoard("posX or posY out of board."))
  }
  @Test
  public void TestException_posYBigger(){
    //Given

    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 7;
    int posY = 15;
    int turn = 1;

    //Then
    assertEquals(playerCPU.playTurn(posX,posY,turn),OutOfBoard("posX or posY out of board."))
  }
  @Test
  public void TestException_posXnegative(){
    //Given

    PlayerCPU playerCPU = new PlayerCPU();
    int posX = -5;
    int posY = 5;
    int turn = 1;

    //Then
    assertEquals(playerCPU.playTurn(posX,posY,turn),OutOfBoard("posX or posY out of board."))
  }
  @Test
  public void TestException_posYnegative(){
    //Given

    PlayerCPU playerCPU = new PlayerCPU();
    int posX = 5;
    int posY = -5;
    int turn = 1;

    //Then
    assertEquals(playerCPU.playTurn(posX,posY,turn),OutOfBoard("posX or posY out of board."))
  }
  @Test
  public void TestCheckWinPositive(){
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int boatsCount = 5;

    //Then
    assertEquals(true,playerCPU.checkWinCondition())
  }
  @Test
  public void TestCheckWinNegative(){
    //Given
    PlayerCPU playerCPU = new PlayerCPU();
    int boatsCount = 2;

    //Then
    assertEquals(false,playerCPU.checkWinCondition())
  }

}
