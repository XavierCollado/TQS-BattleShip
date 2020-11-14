package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import game.Cursor;

/**
 * 
 * @author xavier
 * @version 4.0
 * 
 */
class CursorTest {

	@Test
	void setPosX_validX() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		int newPosX = 2;
		
		// When
		cursor.setPosX(newPosX);
		
		// Then
		assertEquals(newPosX, cursor.getPosX());
	}
	
	@Test
	void setPosY_ValidY() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		int newPosY = 1;
		
		// When
		cursor.setPosY(newPosY);
		
		// Then
		assertEquals(newPosY, cursor.getPosY());
	}
	
	@Test
	void setPosX_invalidXBigger() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		int newPosX = 3;
		
		// When
		cursor.setPosX(newPosX);
		
		// Then
		assertEquals(0, cursor.getPosX());
	}
	
	@Test
	void setPosX_invalidXNegative() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		int newPosX = -1;
		
		// When
		cursor.setPosX(newPosX);
		
		// Then
		assertEquals((lenghtX-1), cursor.getPosX());
	}
	
	@Test
	void setPosY_invalidYBigger() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		int newPosY = 2;
		
		// When
		cursor.setPosY(newPosY);
		
		// Then
		assertEquals(0, cursor.getPosY());
	}
	
	@Test
	void setPosY_invalidYNegative() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		int newPosY = -1;
		
		// When
		cursor.setPosY(newPosY);
		
		// Then
		assertEquals((lenghtY-1), cursor.getPosY());
	}
	
	@Test
	void changeHorientation_fromHorizontalToVertical() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
				
		// When
		cursor.changeHorientation();
				
		// Then
		assertEquals(false, cursor.isHorizontal());
	}
	
	@Test
	void changeHorientation_fromVerticalToHorizontal() {
		// Given
		int lenghtX = 3, lenghtY = 2;
		Cursor cursor = new Cursor(lenghtX, lenghtY);
		cursor.changeHorientation();
		
		// When
		cursor.changeHorientation();
				
		// Then
		assertEquals(true, cursor.isHorizontal());
	}

}
