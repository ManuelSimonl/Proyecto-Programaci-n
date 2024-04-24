package com.example.simulador;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ConfigController {

    @FXML
    private TextField rowsTextField;

    @FXML
    private TextField colsTextField;

    @FXML
    private void confirmConfiguration() {
        try {
            String rowsText = rowsTextField.getText();
            String colsText = colsTextField.getText();

            if (rowsText.isEmpty() || colsText.isEmpty()) {
                // Manejar el caso donde los campos están vacíos
                // Por ejemplo, mostrando un mensaje de error al usuario
                return;
            }

            int rows = Integer.parseInt(rowsText);
            int cols = Integer.parseInt(colsText);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("GameBoard.fxml"));
            Parent root = loader.load();
            GameBoardController gameBoardController = loader.getController();
            gameBoardController.initializeGameBoard(rows, cols); // Método para inicializar el tablero con filas y columnas
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (NumberFormatException e) {
            // Manejar error si los valores ingresados no son números válidos
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}