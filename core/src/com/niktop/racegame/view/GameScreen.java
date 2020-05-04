package com.niktop.racegame.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.niktop.racegame.model.Car;

public class GameScreen implements Screen { // класс для отображения

    private Texture carTexture; //объявили текстуру
    private SpriteBatch batch; // Объявили отрисовщик
    private Car car; //объявили машинку

    @Override
    public void show() { //при переключении на экран
        batch=new SpriteBatch();
        carTexture = new Texture(Gdx.files.internal("car.png"));
        car = new Car(carTexture,0,0,146,288);
    }

    @Override
    public void render(float delta) { //время между кадрами
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin(); // начало работы отрисовщика
        car.draw(batch); //отрисовываем машинку
        batch.end(); // конец работы отрисовщика
    }

    @Override
    public void resize(int width, int height) { //пересоздание камер

    }

    @Override
    public void pause() { //пауза

    }

    @Override
    public void resume() { //возврат из паузы

    }

    @Override
    public void hide() {  //переключения между экранами

    }

    @Override
    public void dispose() { //закрытие игры чистка памяти
        carTexture.dispose();
        batch.dispose();
    }
}
