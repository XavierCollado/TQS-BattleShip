package test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import game.Board;
import game.Cell;
/**
 *
 * @author desirée
 * @version 1.0
 *
 */
public class BoardTest {
	@Test
	public void TestBoardUpdateCellInsideLoop() {
		Board board = new Board();
		int posX = 0;
		int posY = 4;
		String type = "";
		Cell c = new Cell(posX,posY,type);
		board.updateCell(posX, posY, c);
		assertThat(c, is(board.getCell(posX,posY)));
	}

	@Test
	public void TestBoardUpdateCellOnlyZeroTimeExternLoop() {
		Board board = new Board();
		int posX = 10;
		int posY = 4;
		String type = "";
		Cell cells= new Cell(posX,posY,type);
		Cell c = new Cell(posX,posY,type);
		board.updateCell(posX, posY, c);
		assertThat(c, not(cells));

	}
	@Test
	public void TestBoardUpdateCellOnlyTwoTimeExternLoop() {
		Board board = new Board();
		int posX = 1;
		int posY = 2;
		String type = "";
		Cell c = new Cell(posX,posY,type);
		board.updateCell(posX, posY, c);
		assertThat(c, is(board.getCell(posX,posY)));
	}
	@Test
	public void TestBoardUpdateCellSeveralTimeExternLoop() {
		Board board = new Board();
		int posX = 3;
		int posY = 3;
		String type = "";
		Cell c = new Cell(posX,posY,type);
		board.updateCell(posX, posY, c);
		assertThat(c, is(board.getCell(posX,posY)));
	}
	@Test
	public void TestBoardUpdateCellAllTimeMinusOneTimeExternLoop() {
		Board board = new Board();
		int posX = 8;
		int posY = 4;
		String type = "";
		Cell c = new Cell(posX,posY,type);
		board.updateCell(posX, posY, c);
		assertThat(c, is(board.getCell(posX,posY)));
	}
	@Test
	public void TestBoardUpdateCellAllExternLoop() {
		Board board = new Board();
		int posX = 9;
		int posY = 4;
		String type = "";
		Cell c = new Cell(posX,posY,type);
		board.updateCell(posX, posY, c);
		assertThat(c, is(board.getCell(posX,posY)));
	}
}
