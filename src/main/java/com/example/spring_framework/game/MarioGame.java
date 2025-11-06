package com.example.spring_framework.game;

public class MarioGame implements GamingConsole {

    public void up () {
        System.out.println("위로");
    }

    public void down () {
        System.out.println("아래로");
    }

    public void left () {
        System.out.println("왼쪽으로");
    }

    public void right () {
        System.out.println("오른쪽 으로");
    }
}
