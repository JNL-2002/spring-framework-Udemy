package com.example.spring_framework;

import com.example.spring_framework.game.GameRunner;
import com.example.spring_framework.game.MarioGame;

public class App01GamingBasicJava {

    public static void main (String[] args) {


        var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
