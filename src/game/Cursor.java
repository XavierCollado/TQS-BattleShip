package game;


/**
 * 
 * @author xavier
 * @version 1.0
 * 
 */
public class Cursor {

	private int posX;
	private int posY;
	private int lenghtX;
	private int lenghtY;
	
	public Cursor(int lenghtX, int lenghtY) {
		this.lenghtX = lenghtX;
		this.lenghtY = lenghtY;
		this.posX = 0;
		this.posY = 0;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public void setPosX(int newPosX) {
		if(newPosX < 0) {
			this.posX = this.lenghtX-1;
		} else if(newPosX < this.lenghtX) {
			this.posX = newPosX;
		} else {
			this.posX = 0;
		}
	}
	
	public void setPosY(int newPosY) {
		if(newPosY < 0) {
			this.posY = this.lenghtY-1;
		} else if (newPosY < this.lenghtX) {
			this.posY = newPosY;
		} else {
			this.posY = 0;
		}
	}
}
