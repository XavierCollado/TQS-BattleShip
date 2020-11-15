package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.PlayerCPU;
import game.PlayerHUM;

/**
 *
 * @author desirée
 * @version 1.1
 *
 */
class PlayerTestHUM {
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

