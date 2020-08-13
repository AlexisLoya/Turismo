package mx.edu.utez.model.bean;

public class LugarBean {
    private int id;
    private String nombre;
    private CiudadBean ciudad;
    private CategoriaBean categoria;
    private String descripcion;
    private int costo;
    private String imagen;

    public LugarBean() {
    }

    public LugarBean(int id, String nombre, CiudadBean ciudad, CategoriaBean categoria, String descripcion, int costo, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.costo = costo;
        this.imagen = imagen;
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

    public CiudadBean getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadBean ciudad) {
        this.ciudad = ciudad;
    }

    public CategoriaBean getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaBean categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "LugarBean{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad=" + ciudad +
                ", categoria=" + categoria +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
