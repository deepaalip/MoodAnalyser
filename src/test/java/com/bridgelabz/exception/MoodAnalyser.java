package com.bridgelabz.exception;



public class MoodAnalyser {
	  String message ; 
	
	
	  public MoodAnalyser(String message) {
		// TODO Auto-generated constructor stub
		  this.message = message;
	}

   public String analyseMood(String message) {
	   this.message = message;
	   return analyseMood();
   }
	public String  analyseMood() {
		  if(message.contains("Sad")) {
			  return "SAD";
		  }
		  else {
			  return "HAPPY";
		  }
	  }
	  
	 
}
