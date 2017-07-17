package com.svetashov.dotbydot.model;

import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

public class GameWorld {

    private ArrayList<SimpleDot> arrayOfDots;
    private SimpleDot startDot, endDot;
    private Vector2 sizeOfMap;
    public PlayerDot playerDot;

    public GameWorld(Vector2 sizeOfMap, ArrayList<SimpleDot> dots, SimpleDot startDot, SimpleDot endDot){
        this.arrayOfDots = dots;
        this.sizeOfMap = sizeOfMap;
        this.startDot = startDot;
        this.endDot = endDot;

        // player is placing on the start dot
        playerDot.setPosition(this.startDot.getPosition());
    }

    public ArrayList<SimpleDot> getArrayOfDots() {
        return arrayOfDots;
    }

    public PlayerDot getPlayerDot() {
        return playerDot;
    }

}
