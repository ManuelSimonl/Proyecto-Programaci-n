package com.example.simulador;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class GameBoardController {
    @FXML
    private GridPane gameGridPane;
    private int rows;
    private int cols;
    public void initializeGameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        initialize();}

    public void initialize() {
        gameGridPane.getChildren().clear();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                Button cell = new Button();
                cell.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        Button clickedButton = (Button) event.getSource();
                        clickedButton.setStyle("-fx-background-color: #0622f3");
                    }
                });
                gameGridPane.add(cell, j, i);
            }
        }
    }
    private boolean estaViva(Button cell) {
        if (cell.getStyle().equals("-fx-background-color: #0622f3")) {
            return true;
        }else{
            return false;}
    }
    @FXML
    private void playGame(Button cell) {
        int contadorvivas=0;
        int contadormuertas=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (estaViva(cell)) {
                    contadorvivas++;
                } else {
                    contadormuertas++;
                }
            }
            }
        }// da error al iniciar ya que no está acabada esta función
    @FXML
    private void pauseGame() {
        // Lógica para pausar la ejecución del juego
    }

    @FXML
    private void stopGame() {

}}