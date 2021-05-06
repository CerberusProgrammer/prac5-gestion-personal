package sample;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    public static List<Puesto> puestos = new LinkedList<>();
    public static int sizePuesto = 0;
    public static int sizeEmpleado = 0;

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
            consulta.append("CLAVE: ").append(puesto.getClave()).append(", ");
            consulta.append("NOMBRE: ").append(puesto.getNombre()).append(", ");
            consulta.append("DPTO: ").append(puesto.getDepartamento()).append("\n");
        }

        Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
        dialogAlert.setTitle("Consulta General");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText(consulta.toString());
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();
    }

    public void consultaDepartamento(ActionEvent actionEvent) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Value Input");
        dialog.setHeaderText("Enter a value:");
        dialog.setContentText("Value:");
        dialog.showAndWait();

        String result = dialog.getResult().toLowerCase();
        StringBuilder consulta = new StringBuilder();
        boolean finder = true;

        for (Puesto puesto : puestos) {
            if (puesto.getDepartamento().toLowerCase().equals(result)) {
                consulta.append("CLAVE: ").append(puesto.getClave()).append(", ");
                consulta.append("NOMBRE: ").append(puesto.getNombre()).append("\n");
                finder = false;
            }
        }

        if (finder) {
            Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
            dialogAlert.setTitle("Consulta Departamento");
            dialogAlert.setHeaderText(null);
            dialogAlert.setContentText("No se ha encontrado nada relacionado a ese departamento.");
            dialogAlert.initStyle(StageStyle.UTILITY);
            dialogAlert.showAndWait();
            return;
        }

        Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
        dialogAlert.setTitle("Consulta Departamento");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText(consulta.toString());
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();
    }

    public void consultaClave(ActionEvent actionEvent) {

    }

    public void consultaNumero(ActionEvent actionEvent) {
    }

    public void consultaPuesto(ActionEvent actionEvent) {
    }
}
