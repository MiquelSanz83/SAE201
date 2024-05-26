package com.example.sae201;

import javafx.scene.control.Label;

public class Eau {
    protected int coordx;
    protected int coordy;

    public Eau(int cx, int cy) {
        this.coordx = cx;
        this.coordy = cy;
    }



    public void display() {
        Label l = new Label("X X");
        l.setLayoutX(coordx);
        l.setLayoutY(coordy);
    }
}

