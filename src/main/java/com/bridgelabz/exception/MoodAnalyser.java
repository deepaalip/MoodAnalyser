package com.bridgelabz.exception;

import com.bridgelabz.exception.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {
	
	  String message ; 
	
	
	  public MoodAnalyser(String message) {
		// TODO Auto-generated constructor stub
		  this.message = message;
	}

  
	public String  analyseMood() throws MoodAnalyserException {
	try {
		  if(message == null) {
			  throw new  MoodAnalyserException("Message cast can't be null",ExceptionType.Null);
		  }
		  else if(message.equals("")){
			  throw new  MoodAnalyserException("Message cast can't be empty",ExceptionType.EmptyString);
		  }
		  
		  else if(message.contains("Sad")) {
			  return "SAD";
		  }
		  else {
			  return "HAPPY";
		  }
	  }catch(MoodAnalyserException e) {
	      
		 System.out.println(e);
		 return "HAPPY";
	  }
	
	} 
	 
}
