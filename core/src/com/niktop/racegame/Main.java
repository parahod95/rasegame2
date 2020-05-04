package com.niktop.racegame;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.niktop.racegame.view.GameScreen;


public class Main extends Game {

    private Screen gameScreen;

    @Override
    public void create() { //передаем экран creat в классе game находится
    gameScreen= new GameScreen();
    setScreen(gameScreen);
    }
}
