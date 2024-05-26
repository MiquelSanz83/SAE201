package com.example.sae201;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

import java.util.Objects;

public class eventManager implements EventHandler<KeyEvent>{
    Robot r;
    Mine m;
    Entrepot en;


    public void handle(KeyEvent e) {
        switch (e.getCode()) {
            case UP: r.coordx = r.coordx - 1; break;
            case DOWN: r.coordx = r.coordx + 1; break;
            case LEFT: r.coordy = r.coordy - 1; break;
            case RIGHT: r.coordy = r.coordy + 1; break;
            case E:
                if (r.coordx == m.coordx && r.coordy == m.coordy && Objects.equals(r.type, m.type)) {
                    if (r.recoltes + r.extraction < r.stockage){
                        m.restant = m.restant - r.extraction;
                    }
                    else{
                        m.restant = m.restant - (r.stockage - r.recoltes);
                        r.recoltes = r.stockage;
                    }
                }
            case A:
                if (r.coordx == en.coordx && r.coordy == en.coordy && Objects.equals(r.type, en.type)){
                    en.stockage = en.stockage + r.recoltes;
                    r.recoltes = 0;
                }
        }

    }

}