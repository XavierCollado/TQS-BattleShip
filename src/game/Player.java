package game;

/**
 * @author desirée
 * @version 1.0
 */

public interface Player {
  void playTurn();
  void updateBoardCell(int posX,int posY,Cell cell);
  boolean checkWinCondition();
  boolean isCarrierAlive();
  boolean isBattleshipAlive();
  boolean isCruiserAlive();
  boolean isSubmarineAlive();
  boolean isDestroyerAlive();
}
