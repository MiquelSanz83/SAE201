package com.example.sae201;

import javafx.scene.control.Label;
import java.util.Random;

public class Entrepot {
    private static int numero;
    protected String type;
    protected int coordx;
    protected int coordy;
    protected int stockage;

    public Entrepot(String ty, int cx, int cy) {
        numero = numero + 1;
        type = ty;
        coordx = cx;
        coordy = cy;
        stockage = 0;
    }

    public Entrepot() {
        numero = numero + 1;
        String[] min = {"OR","NICKEL"};
        Random rand = new Random();
        int select = rand.nextInt(min.length);
        type = min[select];
        coordx = (int)(Math.random()*9);;
        coordy = (int)(Math.random()*9);
        stockage = 0;
    }

    public void display() {
        Label l = new Label("E "+numero);
        l.setLayoutX(coordx);
        l.setLayoutY(coordy);
    }
}