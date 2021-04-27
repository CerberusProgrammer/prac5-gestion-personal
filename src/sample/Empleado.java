package sample;

public class Empleado {

    int id;
    String nombre;
    int edad;
    float horas;

    public Empleado(int id, String nombre, int edad, float horas) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.horas = horas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }
}
