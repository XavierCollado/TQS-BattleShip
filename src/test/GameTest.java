package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.Game;

/**
 * 
 * @author xavier
 * @version 3.0
 */
class GameTest {

	@Test
	void applyAction_MenuScreen_WhenWeSelectOption1InMenuScreenTheScreenIdIsSetToSelectionScreen() {
		// Given
		Game game = new Game();
		int selectionScreenId = 1;
		
		// When
		game.applyAction("1");
		
		// Then
		assertEquals(selectionScreenId, game.getScreen());
	}
	
	@Test
	void applyAction_MenuScreen_WhenWeSelectOption2InMenuScreenWeEndTheGame() {
		// Given
		Game game = new Game();
		
		// When
		game.applyAction("2");
		
		// Then
		assertFalse(game.isPlaying());
	}
	
	@Test
	void applyAction_MenuScreen_WhenWeGetAnInvalidStringInputNothingHappens() {
		// Given
		Game game = new Game();
		int menuScreenId = 0;
		
		// When
		game.applyAction("1afsf");
	
		
		// Then
		assertTrue(game.isPlaying());
		assertEquals(menuScreenId, game.getScreen());
	}

}
