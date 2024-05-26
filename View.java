package com.example.sae201;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class View extends StackPane {

    public View() {
        Robot robot = new Robot();
        Label l = new Label("R "+ Robot.numero);
        l.setLayoutX(robot.coordx);
        l.setLayoutY(robot.coordy);


        getChildren().add(l);
    }

    // Ajoutez ici des méthodes supplémentaires pour interagir avec votre Node
}
