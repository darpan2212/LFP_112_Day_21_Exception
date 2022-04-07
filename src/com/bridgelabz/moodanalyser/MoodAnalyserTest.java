package com.bridgelabz.moodanalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void analyseSadMood() {
		MoodAnalyser analyser = new MoodAnalyser();

		String actualResult = analyser
				.analyseMood("I am in sad mood");

		assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseHappyMood() {
		MoodAnalyser analyser = new MoodAnalyser();

		String actualResult = analyser
				.analyseMood("I am in happy mood");

		assertEquals("HAPPY", actualResult);
	}

	@Test
	public void analyseNullMood() {
		MoodAnalyser analyser = new MoodAnalyser();

		String actualResult = analyser.analyseMood(null);

		assertEquals("Invalid input", actualResult);
	}

}