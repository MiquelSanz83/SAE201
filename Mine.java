package com.example.sae201;

import javafx.scene.control.Label;
import java.util.Random;

public class Mine {
    private static int numero=0;
    protected String type;
    protected int total;
    protected int restant;
    protected int coordx;
    protected int coordy;

    public Mine(String ty, int t, int cx, int cy) {
        numero = numero + 1;
        type = ty;
        coordx = cx;
        coordy = cy;
        total = t;
        restant = t;
    }

    public Mine(){
        numero = numero + 1;
        String[] min = {"OR","NICKEL"};
        Random rand = new Random();
        int select = rand.nextInt(min.length);
        type = min[select];
        coordx = (int)(Math.random()*9);;
        coordy = (int)(Math.random()*9);;
    }

    public void display() {
        Label l = new Label("M "+numero);
        l.setLayoutX(coordx);
        l.setLayoutY(coordy);
    }
}
