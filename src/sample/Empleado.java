package sample;

public class Empleado {

    int id = 0;
    String nombre;
    int edad;
    float horas;
    String puesto;

    public Empleado(String nombre, int edad, float horas) {
        this.id += 1;
        this.nombre = nombre;
        this.edad = edad;
        this.horas = horas;
    }

    public Empleado(int id, String nombre, int edad, float horas, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.horas = horas;
        this.puesto = puesto;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", horas=" + horas +
                ", puesto=" + puesto +
                '}';
    }
}
