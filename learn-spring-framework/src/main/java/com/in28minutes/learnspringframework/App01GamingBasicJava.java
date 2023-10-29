package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //결합이란 무언가를 변경하는 데 얼마나 많은 작업이 관련되어 있는지에 대한 측정
        //노트북 움직이기가 쉬움, 랩탑 움직이기 어려움
        //결합을 느슨하기 위한 방법 : interface 사용
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        GamingConsole game = new PacmanGame(); // 1. Object Creation
        GameRunner gameRunner = new GameRunner(game);
        // 2. Object Creation + Wiring Of Dependencies
        //GameRunner 게임을 실행시킬수 있으며 실행하려면 게임이 필요함
        //일반적으로 게임이 의존성이라고 할 수 있다
        //Game is a Dependency of GameRunner
        gameRunner.run();
    }
}
