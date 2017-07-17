package com.svetashov.dotbydot.model;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class PlayerDot extends Dot {

    // velocity of moving dot
    public static final float SPEED = 3f;
    Vector2 velocity = new Vector2();

    public PlayerDot(Vector2 position, Texture texture) {
        super(position, texture);
    }

    public void update(float delta) {
        setPosition(velocity.scl(delta));
    }

    public Vector2 getVelocity() {
        return velocity;
    }

}
