package game;

/**
 * @author desirée & xavier
 * @version 1.3
 */

public interface Player {
  void playTurn(int posX,int posY, int screen);
  void updateBoardCell(int posX,int posY,Cell cell);
  boolean checkWinCondition(int boatsCount);
  boolean isCarrierAlive();
  boolean isBattleshipAlive();
  boolean isCruiserAlive();
  boolean isSubmarineAlive();
  boolean isDestroyerAlive();
  String getCellType(int posX, int posY);
  Board getBoard();
}
