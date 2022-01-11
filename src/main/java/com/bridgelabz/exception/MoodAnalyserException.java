package com.bridgelabz.exception;

public class MoodAnalyserException extends Exception{
	public ExceptionType type;
	public String message;
	public enum ExceptionType{
		Null,EmptyString
	}
  public MoodAnalyserException(String message,ExceptionType type) {
	  super(message);
	  this.type = type;	
  }
}
