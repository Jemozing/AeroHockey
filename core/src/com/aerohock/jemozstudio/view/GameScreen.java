package com.aerohock.jemozstudio.view;

import com.aerohock.jemozstudio.models.Bita;
import com.aerohock.jemozstudio.utils.Konstants;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GameScreen implements Screen {
    private Texture background;
    private Sprite bg;
    @Override
    public void show() {
        background = new Texture("hockey_field.png");
        bg = new Sprite(background);
        bg.setBounds(0,0, Konstants.WIDTH, Konstants.HEIGHT);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
