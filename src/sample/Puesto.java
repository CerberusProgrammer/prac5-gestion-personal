package sample;

import java.util.List;

public class Puesto {

    int clave = 0;
    String nombre;
    String departamento;
    List<Empleado> empleados;

    public Puesto(String nombre, String departamento) {
        this.clave += 1;
        this.nombre = nombre;
        this.departamento = departamento;
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

    @Override
    public String toString() {
        return "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", empleados=" + empleados;
    }
}
