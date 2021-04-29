package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Controller;
import sample.Empleado;
import sample.Puesto;

import java.net.URL;
import java.util.ResourceBundle;

public class EliminarEmpleado implements Initializable {

    @FXML
    private TextField inputIDEliminar;

    @FXML
    private TextArea textAreaInformacion;

    @FXML
    void eliminarEmpleado(ActionEvent event) {
        if (Controller.empleados.isEmpty()) {
            Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
            dialogAlert.setTitle("Aviso");
            dialogAlert.setHeaderText(null);
            dialogAlert.setContentText("La lista esta vacia.");
            dialogAlert.initStyle(StageStyle.UTILITY);
            dialogAlert.showAndWait();
        } else {
            int id = Integer.parseInt(inputIDEliminar.getText());

            for (Empleado empleado : Controller.empleados) {
                if (empleado.getId() == id) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Eliminar empleado");
                    alert.setContentText("Desea eliminar realmente el empleado?" + "\n" +
                            empleado.toString());
                    ButtonType okButton = new ButtonType("Si", ButtonBar.ButtonData.YES);
                    ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.NO);
                    ButtonType cancelButton = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);
                    alert.getButtonTypes().setAll(okButton, noButton, cancelButton);

                    alert.showAndWait().ifPresent(type -> {
                        if (type == okButton)
                            Controller.empleados.remove(empleado);
                    });
                }
            }
        }
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (Empleado e :
                Controller.empleados)
            textAreaInformacion.appendText(e.toString() + "\n");
    }
}
