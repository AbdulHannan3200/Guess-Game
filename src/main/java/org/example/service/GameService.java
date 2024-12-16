package org.example.service;

import java.util.Random;

public class GameService {


    public String guessNumber(int gNum) {
        if (gNum < 0 || gNum > 9) {
            throw new IllegalArgumentException("The number must be between 0 and 9.");
        }

        Random random = new Random();
        int generatedNum = random.nextInt(10);  // Random number between 0 and 9

        if (gNum == generatedNum) {
            return "Correct! You guessed the number.";
        } else {
            return "Wrong! The correct number was " + generatedNum;
        }
    }
}
