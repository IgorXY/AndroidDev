package com.example.tonko_i.a70percent.Entity;

import java.io.Serializable;

/**
 * Created by Tonko_I on 17/04/2017.
 */

public class GameProgress implements Serializable{
    private Game game;
    private int stage;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
