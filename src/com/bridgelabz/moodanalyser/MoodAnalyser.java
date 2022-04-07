package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String msg) {
		if (msg.toLowerCase().contains("sad") || msg
				.toLowerCase().contains("exhausted")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}