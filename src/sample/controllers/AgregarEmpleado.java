package sample.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Controller;
import sample.Empleado;
import sample.Puesto;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class AgregarEmpleado implements Initializable {

    @FXML
    private TextField inputHorasEmpleado;
    @FXML
    private TextField inputEdadEmpleado;
    @FXML
    private TextField inputNombreEmpleado;
    @FXML
    private TextField inputPuesto;

    String seleccion;

    @FXML
    void guardarEmpleado(ActionEvent event) {
        if (inputHorasEmpleado.getText().isEmpty() |
                inputEdadEmpleado.getText().isEmpty() |
                inputNombreEmpleado.getText().isEmpty())
            return;


        for (Puesto puesto : Controller.puestos) {
            if (puesto.getNombre().toLowerCase().equals(inputPuesto.getText().toLowerCase())) {
                Empleado empleado = new Empleado(inputNombreEmpleado.getText(),
                        Integer.parseInt(inputEdadEmpleado.getText()),
                        Integer.parseInt(inputHorasEmpleado.getText()),
                        inputPuesto.getText().toLowerCase());

                empleado.setPuesto(seleccion);
                Controller.empleados.add(empleado);

                for (Puesto p : Controller.puestos){
                    if (p.getNombre().toLowerCase().equals(inputPuesto.getText().toLowerCase()))
                        p.addEmpleado(empleado);
                }

                Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
                dialogAlert.setTitle("Aviso");
                dialogAlert.setHeaderText(null);
                dialogAlert.setContentText("Se ha agregado el empleado correctamente.");
                dialogAlert.initStyle(StageStyle.UTILITY);
                dialogAlert.showAndWait();

                final Node source = (Node) event.getSource();
                final Stage stage = (Stage) source.getScene().getWindow();
                stage.close();
                return;
            }
        }

        Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
        dialogAlert.setTitle("Aviso");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText("No se ha colocado la informacion correcta.");
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();
        return;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
