package com.example.simulador;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button; // Agrega esta importación
public class GameBoardController {

    @FXML
    private GridPane gameGridPane;

    private int rows;
    private int cols;

    // Método para inicializar el tablero de juego con el número de filas y columnas especificado
    public void initializeGameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        initialize();
    }

    // Método para inicializar el tablero de juego
    public void initialize() {
        // Lógica para inicializar el tablero con las filas y columnas especificadas
        // Por ejemplo, puedes agregar celdas al GridPane según el número de filas y columnas
        gameGridPane.getChildren().clear(); // Limpiar el GridPane antes de agregar nuevas celdas
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Agregar celda al tablero
                // Por ejemplo, puedes crear un objeto gráfico como un Button y agregarlo al GridPane
                Button cell = new Button();
                gameGridPane.add(cell, j, i); // Agregar celda en la posición (j, i)
            }
        }
    }

    // Métodos para controlar la ejecución del juego
    @FXML
    private void playGame() {
        // Lógica para iniciar la ejecución del juego
    }

    @FXML
    private void pauseGame() {
        // Lógica para pausar la ejecución del juego
    }

    @FXML
    private void stopGame() {
        // Lógica para detener la ejecución del juego
    }
}