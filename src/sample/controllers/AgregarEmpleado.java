package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Controller;
import sample.Empleado;

public class AgregarEmpleado {

    @FXML
    private TextField inputHorasEmpleado;
    @FXML
    private TextField inputEdadEmpleado;
    @FXML
    private TextField inputNombreEmpleado;

    @FXML
    void guardarEmpleado(ActionEvent event) {
        if (inputHorasEmpleado.getText().isEmpty() |
                inputEdadEmpleado.getText().isEmpty() |
                inputNombreEmpleado.getText().isEmpty())
            return;

        Empleado empleado = new Empleado(inputNombreEmpleado.getText(),
                Integer.parseInt(inputEdadEmpleado.getText()),
                Integer.parseInt(inputHorasEmpleado.getText()));
        Controller.empleados.add(empleado);

        Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
        dialogAlert.setTitle("Aviso");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText("Se ha agregado el empleado correctamente.");
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();

        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
