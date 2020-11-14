package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import game.Cursor;

/**
 * 
 * @author xavier
 * @version 1.0
 * 
 */
class CursorTest {

	@Test
	void setPosX_validX() {
		// Given
		Cursor cursor = new Cursor(3, 2);
		int newPosX = 3;
		
		// When
		cursor.setPosX(newPosX);
		
		// Then
		assertEquals(newPosX, cursor.getPosX());
	}
	
	@Test
	void setPosY_validXValidY() {
		// Given
		Cursor cursor = new Cursor(3, 2);
		int newPosY = 2;
		
		// When
		cursor.setPosY(newPosY);
		
		// Then
		assertEquals(newPosY, cursor.getPosY());
	}
	
	@Test
	void setPosX_invalidXBigger() {
		// Given
		Cursor cursor = new Cursor(3, 2);
		int newPosX = 4;
		
		// When
		
		
		// Then
		Assertions.assertThrows(NumberFormatException.class, () -> {
			cursor.setPosX(newPosX);
		});
	}
	
	@Test
	void setPosX_invalidXNegative() {
		// Given
		Cursor cursor = new Cursor(3, 2);
		int newPosX = -1;
		
		// When
		
		
		// Then
		Assertions.assertThrows(NumberFormatException.class, () -> {
			cursor.setPosX(newPosX);
		});
	}
	
	@Test
	void setPosY_invalidYBigger() {
		// Given
		Cursor cursor = new Cursor(3, 2);
		int newPosY = 3;
		
		// When
		
		
		// Then
		Assertions.assertThrows(NumberFormatException.class, () -> {
			cursor.setPosY(newPosY);
		});
	}
	
	@Test
	void setPosY_invalidYNegative() {
		// Given
		Cursor cursor = new Cursor(3, 2);
		int newPosY = -1;
		
		// When
		
		
		// Then
		Assertions.assertThrows(NumberFormatException.class, () -> {
			cursor.setPosY(newPosY);
		});
	}

}
