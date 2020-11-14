package game;

/**
 * @author desirée
 * @version 1.0
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
  public PlayerCPU(){
    this.boatsStatus = new BoatsStatus();
    this.board = new Board();
    this.boatsCount = 0;
    this.aliveCarrier = true;
    this.aliveBattleship = true;
    this.aliveCruiser = true;
    this.aliveSubmarine = true;
    this.aliveDestroyer = true;
  }
  public void playTurn(int posX,int posY){

  }
  private void updateBoardCell(int posX,int posY,Cell cell){

  }
  private boolean checkWinCondition(){

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
