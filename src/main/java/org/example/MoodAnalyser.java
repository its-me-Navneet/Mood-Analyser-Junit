package org.example;

public class MoodAnalyser {

     String message ;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public boolean happyMood(String s){

         if(s == null) return true ;
        String []arr = s.toLowerCase().split(" ") ;

        for(String curr:arr){
             if(curr.equals("sad")) {
                 return false ;
             }
        }
        return true ;

    }
}
