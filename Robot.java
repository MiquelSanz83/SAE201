package com.example.sae201;

import javafx.scene.control.Label;
import java.util.Random;

public class Robot {
    protected static int numero=0;
    protected String type;
    protected int stockage;
    protected int extraction;
    protected int recoltes;
    protected int coordx;
    protected int coordy;

    public Robot(String t, int s, int e,int cx, int cy) {
        numero = numero + 1;
        type = t;
        stockage = s;
        extraction = e;
        coordx = cx;
        coordy = cy;
        recoltes = 0;
    }

    public Robot(){
        super();
        numero = numero + 1;
        String[] min = {"OR","NICKEL"};
        Random rand = new Random();
        int select = rand.nextInt(min.length);
        type = min[select];
        stockage = (int)(Math.random()*4+5);
        extraction = (int)(Math.random()*2+1);
        coordx = (int)(Math.random()*9);
        coordy = (int)(Math.random()*9);
        recoltes = 0;
    }
    public void display() {
        Label l = new Label("R "+numero);
        l.setLayoutX(coordx);
        l.setLayoutY(coordy);
    }


}

