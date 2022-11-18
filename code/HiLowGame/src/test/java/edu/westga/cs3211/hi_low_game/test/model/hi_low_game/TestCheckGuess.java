package edu.westga.cs3211.hi_low_game.test.model.hi_low_game;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.hi_low_game.model.GuessReport;
import edu.westga.cs3211.hi_low_game.model.HiLowGame;

class TestCheckGuess {
	
	private class RandomFakeSpy extends Random {
		public int callCount;
		public int lastBoundProvided;
		
		public RandomFakeSpy() {
			super();
			this.callCount = 0;
			this.lastBoundProvided = -1;
		}
		
		@Override
		public int nextInt(int bound) {
			this.lastBoundProvided = bound;
			this.callCount++;
			return 2;
		}
	}
}
