package com.example.sae201;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class lanceur extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Robot r1 = new Robot();
        Mine m1 = new Mine();
        Entrepot e1 = new Entrepot();
        r1.display();
        m1.display();
        e1.display();
        View nodeView = new View();
        StackPane sp = new StackPane();
        sp.getChildren().add(nodeView);
        Group g = new Group();

        Scene scene = new Scene(g, 700, 700);
        stage.setTitle("SAE_201");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}