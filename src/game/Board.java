package game;

/**
 * @autor desirée
 * @version 1.0
 */
public class Board{
  private Cell cells[][];
  public Board() {
    this.cells = new Cell[10][10];
  }

  public Cell getCell(int posX,int posY) {
    return cells[posX][posY];
  }
  public void updateCell(int posX,int posY, Cell c) {
    if(posX >= 0 && posY >= 0 && posX < 10 && posY < 10) {
      for(int i = 0; i < cells.length; i++) {
        for(int j= 0; j < cells[i].length; j++) {
          if(i == posX && j == posY) {
            cells[posX][posY] = c;
          }

        }
      }
    }
  }
}
