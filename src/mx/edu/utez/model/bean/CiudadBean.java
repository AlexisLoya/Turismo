package mx.edu.utez.model.bean;

public class CiudadBean {
    private int id;
    private String nombre;

    public CiudadBean() {
    }

    public CiudadBean(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "CiudadBean{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
