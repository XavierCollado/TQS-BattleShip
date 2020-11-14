package game;

/**
 * 
 * @author xavier
 * @version 2.0
 *
 */
public class Cell {
	private int posX;
	private int posY;
	private String type;
	private boolean hit;
	
	public Cell(int posX, int posY, String type) {
		this.posX = posX;
		this.posY = posY;
		this.type = type;
		this.hit = false;
	}
	
	public void hit() {
		this.hit = true;
	}
	
	public boolean ishit() {
		return this.hit;
	}
}
