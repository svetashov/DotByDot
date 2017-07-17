package com.svetashov.dotbydot.model;

import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

public class GameWorld {

    private ArrayList<SimpleDot> arrayOfDots;
    private Vector2 sizeOfMap;
    public PlayerDot playerDot;

    public GameWorld(Vector2 sizeOfMap, ArrayList<SimpleDot> dots){
        this.arrayOfDots = dots;
        this.sizeOfMap = sizeOfMap;

        // player is placing on the start dot
        playerDot.setPosition(arrayOfDots.get(0).getPosition());
    }

    public ArrayList<SimpleDot> getArrayOfDots() {
        return arrayOfDots;
    }

    public PlayerDot getPlayerDot() {
        return playerDot;
    }

}
