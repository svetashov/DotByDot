package com.svetashov.dotbydot.model;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class SimpleDot extends Dot {

    private boolean isUsed;
    private Color color;

    public SimpleDot(Vector2 position, Texture texture, Color color) {
        super(position, texture);
        this.color = color;
        isUsed = false;
    }

    // Getters and setters
    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public Color getColor() {
        return color;
    }
}
