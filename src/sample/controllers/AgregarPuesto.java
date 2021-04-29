package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Controller;
import sample.Puesto;

public class AgregarPuesto {

    @FXML
    private TextField inputNombrePuesto;
    @FXML
    private TextField inputDepartamentoPuesto;

    @FXML
    void guardarPuesto(ActionEvent event) {
        if (inputDepartamentoPuesto.getText().isEmpty() |
                inputNombrePuesto.getText().isEmpty())
            return;

        Puesto puesto = new Puesto(inputNombrePuesto.getText(),
                inputDepartamentoPuesto.getText());
        Controller.puestos.add(puesto);

        Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
        dialogAlert.setTitle("Aviso");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText("Se ha agregado el puesto correctamente.");
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();

        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
