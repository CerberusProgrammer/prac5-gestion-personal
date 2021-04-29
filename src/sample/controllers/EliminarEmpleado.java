package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Controller;
import sample.Empleado;

import java.net.URL;
import java.util.ResourceBundle;

public class EliminarEmpleado implements Initializable {

    @FXML
    private TextField inputIDEliminar;

    @FXML
    private TextArea textAreaInformacion;

    @FXML
    void eliminarEmpleado(ActionEvent event) {
        int id = Integer.parseInt(inputIDEliminar.getText());

        if (Controller.empleados.removeIf(e -> e.getId() == id)) {
            Alert dialogAlert = new Alert(Alert.AlertType.CONFIRMATION);
            dialogAlert.setTitle("Aviso");
            dialogAlert.setHeaderText(null);
            dialogAlert.setContentText("Se ha removido el usuario correctamente.");
            dialogAlert.initStyle(StageStyle.UTILITY);
            dialogAlert.showAndWait();

            final Node source = (Node) event.getSource();
            final Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        } else {
            Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
            dialogAlert.setTitle("Aviso");
            dialogAlert.setHeaderText(null);
            dialogAlert.setContentText("No se ha removido el usuario.");
            dialogAlert.initStyle(StageStyle.UTILITY);
            dialogAlert.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (Empleado e :
                Controller.empleados) {
            textAreaInformacion.appendText(e.toString() + "\n");
        }
    }
}
