package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    public static List<Puesto> puestos = new LinkedList<>();
    public static List<Empleado> empleados = new LinkedList<>();

    @FXML
    void agregarPuesto() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/agregarPuesto.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Agregar Puesto");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void agregarEmpleado(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/agregarEmpleado.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Agregar Empleado");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    public void eliminarEmpleado(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/eliminarEmpleado.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Agregar Empleado");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    public void eliminarPuesto(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/eliminarPuesto.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Agregar Empleado");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void consultaGeneral(ActionEvent actionEvent) {
        StringBuilder consulta = new StringBuilder();

        for (Puesto puesto: puestos) {
            consulta.append("clave: ").append(puesto.getClave()).append(", ");
            consulta.append("nombre: ").append(puesto.getClave()).append(", ");
            consulta.append("departamento: ").append(puesto.getClave()).append("\n");
        }

        Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
        dialogAlert.setTitle("Consulta General");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText(consulta.toString());
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();
    }

    public void consultaDepartamento(ActionEvent actionEvent) {
        
    }

    public void consultaClave(ActionEvent actionEvent) {
    }

    public void consultaNumero(ActionEvent actionEvent) {
    }

    public void consultaPuesto(ActionEvent actionEvent) {
    }
}
