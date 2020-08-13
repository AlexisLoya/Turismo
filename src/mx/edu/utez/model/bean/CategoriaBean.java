package mx.edu.utez.model.bean;

public class CategoriaBean {
    private int id;
    private String nombre;

    public CategoriaBean() {
    }

    public CategoriaBean(int id, String nombre) {
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
        return "CategoriaBean{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
