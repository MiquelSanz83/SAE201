package com.example.sae201;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Grille extends Node {

    public Grille() {
        GridPane grid = new GridPane();

        for (int row = 0; row < 11; row++) {
            for (int col = 0; col < 11; col++) {
                if (col == 0 && row < 10) {
                    textDisplay(grid, Integer.toString(row), row+5, col+18);
                } else if (row != 10) {
                    Rectangle rec = new Rectangle();
                    rec.setWidth(20);
                    rec.setHeight(20);
                    rec.setFill(Color.WHITE);
                    rec.setStroke(Color.BLACK);

                    if (row%2==0) {
                        GridPane.setRowIndex(rec, row + 5);
                        GridPane.setColumnIndex(rec, col + 18);
                    }
                    grid.getChildren().addAll(rec);
                }
            }
            if (row == 10) {
                for (int col = 0; col < 11; col++){
                    if (col == 0) {
                        textDisplay(grid, "/", row, col);
                    } else {
                        textDisplay(grid, Integer.toString(col - 1), row, col+18);
                    }
                }
            }
        }
        grid.setLayoutX(150);
        grid.setLayoutY(50);

    }

    private void textDisplay(GridPane grid, String theText, int row, int col) {
        Text text = new Text();

        text.setText(theText);
        text.setTextAlignment(TextAlignment.CENTER);
        GridPane.setRowIndex(text, row);
        GridPane.setColumnIndex(text, col);
        grid.getChildren().addAll(text);
    }

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}
