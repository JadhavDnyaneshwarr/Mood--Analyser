package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
