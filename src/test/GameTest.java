package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.Game;

/**
 * 
 * @author xavier
 * @version 2.0
 */
class GameTest {

	@Test
	void endGame() {
		// Given
		Game game = new Game();
		
		// When
		game.endGame();
		
		// Then
		assertFalse(game.isPlaying());
	}

}
