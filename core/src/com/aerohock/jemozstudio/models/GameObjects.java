package com.aerohock.jemozstudio.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

abstract class GameObjects {

    Rectangle bounds;
    Sprite object;

    GameObjects(Texture texture, float x, float y, float width, float height){
        bounds = new Rectangle(x, y, width, height);
        object = new Sprite(texture);
    }

    public void draw(SpriteBatch batch){
        object.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        object.draw(batch);

    }

}
