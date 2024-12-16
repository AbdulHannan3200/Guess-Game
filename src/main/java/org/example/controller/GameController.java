package org.example.controller;

import org.example.service.GameService;

import java.util.Scanner;

public class GameController {
    private final GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess Game!");
        System.out.println("Guess a number between 0 and 9:");

        try {
            int userGuess = scanner.nextInt();
            String result = gameService.guessNumber(userGuess);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
