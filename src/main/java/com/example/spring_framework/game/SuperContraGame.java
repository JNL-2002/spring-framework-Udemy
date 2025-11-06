package com.example.spring_framework.game;

public class SuperContraGame implements GamingConsole{

    public void up () {
        System.out.println("위");
    }

    public void down () {
        System.out.println("아래");
    }

    public void left () {
        System.out.println("왼쪽");
    }

    public void right () {
        System.out.println("오른쪽");
    }
}
