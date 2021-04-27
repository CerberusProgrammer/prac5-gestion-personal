package sample;

import java.util.List;

public class Puesto {

    int clave;
    String nombre;
    String departamento;
    List<Empleado> empleados;

    public Puesto(int clave, String nombre, String departamento) {
        this.clave = clave;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public Puesto(int clave, String nombre, String departamento, List<Empleado> empleados) {
        this.clave = clave;
        this.nombre = nombre;
        this.departamento = departamento;
        this.empleados = empleados;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
