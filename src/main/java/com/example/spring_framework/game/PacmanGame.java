package com.example.spring_framework.game;

public class PacmanGame implements GamingConsole{

    public void up () {
        System.out.println("위에");
    }

    public void down () {
        System.out.println("아래에");
    }

    public void left () {
        System.out.println("왼쪽에");
    }

    public void right () {
        System.out.println("오른쪽에");
    }
}
