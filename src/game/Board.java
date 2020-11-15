package game;

/**
 * @autor desirée
 * @version 1.2
 */
public class Board{
  private Cell cells[][];
  public Board() {
    String type = CellConstants.WATER_TYPE;
    this.cells = new Cell[10][10];
    Cell cela = new Cell(10,10,type);
    for(int i = 0; i < 10; i++) {
      for(int j=0;j<10;j++) {
        updateCell(i,j,cela);
      }
    }
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