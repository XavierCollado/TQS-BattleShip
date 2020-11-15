package game;

/**
 * @author desirée
 * @version 1.3
 */

public interface Player {
  void playTurn(int posX,int posY);
  void updateBoardCell(int posX,int posY,Cell cell);
  boolean checkWinCondition(int boatsCount);
  boolean isCarrierAlive();
  boolean isBattleshipAlive();
  boolean isCruiserAlive();
  boolean isSubmarineAlive();
  boolean isDestroyerAlive();
}
