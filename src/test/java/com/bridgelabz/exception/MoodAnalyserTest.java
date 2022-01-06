package com.bridgelabz.exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
 @Test
	public void  givenMood_WhenHappy_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
 @Test
	public void  givenMood_WhenSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am In any Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
	
 @Test
	public void  givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
	
}
