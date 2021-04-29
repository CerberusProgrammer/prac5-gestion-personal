package sample.controllers;

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
import java.util.ResourceBundle;

public class AgregarEmpleado implements Initializable {

    @FXML
    private TextField inputHorasEmpleado;
    @FXML
    private TextField inputEdadEmpleado;
    @FXML
    private TextField inputNombreEmpleado;
    @FXML
    private MenuButton menuPuestos;

    String seleccion;

    @FXML
    void guardarEmpleado(ActionEvent event) {
        if (inputHorasEmpleado.getText().isEmpty() |
                inputEdadEmpleado.getText().isEmpty() |
                inputNombreEmpleado.getText().isEmpty())
            return;

        Empleado empleado = new Empleado(inputNombreEmpleado.getText(),
                Integer.parseInt(inputEdadEmpleado.getText()),
                Integer.parseInt(inputHorasEmpleado.getText()));
        empleado.setPuesto(seleccion);
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (Puesto puesto : Controller.puestos) {
            MenuItem menuItem = new MenuItem();
            menuItem.setText(puesto.getNombre());
            menuItem.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    seleccion = ((MenuItem)event.getSource()).getText();
                }
            });

            menuPuestos.getItems().add(menuItem);
        }
    }
}
