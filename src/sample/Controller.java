package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    public static List<Puesto> puestos = new LinkedList<>();
    public static List<Empleado> empleados = new LinkedList<>();

    @FXML
    void agregarPuesto() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("puesto.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Agregar Puesto");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void agregarEmpleado() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("empleado.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Agregar Empleado");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
