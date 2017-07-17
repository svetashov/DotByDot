package com.svetashov.dotbydot.controller;

import com.svetashov.dotbydot.model.GameWorld;
import com.svetashov.dotbydot.model.PlayerDot;

import java.util.HashMap;
import java.util.Map;


public class GameWorldController {
    //ways of movement
    enum Keys {
        LEFT, RIGHT, UP, DOWN
    }

    //player
    public PlayerDot playerDot;


    static Map<Keys, Boolean> keys = new HashMap<Keys, Boolean>();

    //первоначально стоим
    static {
        keys.put(Keys.LEFT, false);
        keys.put(Keys.RIGHT, false);
        keys.put(Keys.UP, false);
        keys.put(Keys.DOWN, false);
    }

    public GameWorldController(GameWorld world) {
        this.playerDot = world.getPlayerDot();
    }

    //флаг устанавливаем, что движемся влево
    public void leftPressed() {
        keys.get(keys.put(Keys.LEFT, true));
    }

    //флаг устанавливаем, что движемся вправо
    public void rightPressed() {
        keys.get(keys.put(Keys.RIGHT, true));
    }

    //флаг устанавливаем, что движемся вверх
    public void upPressed() {
        keys.get(keys.put(Keys.UP, true));
    }

    //флаг устанавливаем, что движемся вниз
    public void downPressed() {
        keys.get(keys.put(Keys.DOWN, true));
    }

    //освобождаем флаги
    public void leftReleased() {
        keys.get(keys.put(Keys.LEFT, false));
    }

    public void rightReleased() {
        keys.get(keys.put(Keys.RIGHT, false));
    }

    public void upReleased() {
        keys.get(keys.put(Keys.UP, false));
    }

    public void downReleased() {
        keys.get(keys.put(Keys.DOWN, false));
    }

    //главный метод класса...обновляем состояния объектов здесь
    public void update(float delta) {
        processInput();
        playerDot.update(delta);
    }

    public void resetWay() {
        rightReleased();
        leftReleased();
        downReleased();
        upReleased();
    }

    //в зависимости от выбранного направления движения выставляем новое направление движения для персонажа
    private void processInput() {
        if (keys.get(Keys.LEFT))
            playerDot.getVelocity().x = -PlayerDot.SPEED;

        if (keys.get(Keys.RIGHT))
            playerDot.getVelocity().x = PlayerDot.SPEED;

        if (keys.get(Keys.UP))
            playerDot.getVelocity().y = PlayerDot.SPEED;

        if (keys.get(Keys.DOWN))
            playerDot.getVelocity().y = -PlayerDot.SPEED;

        //если не выбрано направление, то стоим на месте
        if ((keys.get(Keys.LEFT) && keys.get(Keys.RIGHT)) || (!keys.get(Keys.LEFT) && (!keys.get(Keys.RIGHT))))
            playerDot.getVelocity().x = 0;
        if ((keys.get(Keys.UP) && keys.get(Keys.DOWN)) || (!keys.get(Keys.UP) && (!keys.get(Keys.DOWN))))
            playerDot.getVelocity().y = 0;

    }
}
