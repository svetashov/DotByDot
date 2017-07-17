package com.svetashov.dotbydot.model;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class Dot {
    // Radius of all dots
    static final float RADIUS = 1f;

    // Coords
    private Vector2 position = new Vector2();
    private Texture texture;

    // Constructor
    public Dot(Vector2 position, Texture texture){
        this.position = position;
        this.texture = texture;
    }

    // Getters and setters
    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Texture getTexture() {
        return texture;
    }

}
