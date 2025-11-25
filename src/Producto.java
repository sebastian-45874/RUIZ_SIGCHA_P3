//VINICIO RUIZ Y ANDRES SIGCHA

public class Producto {
    private int id;
    private String Nombre;
    private String Categoria;
    private int cantidad;

    public Producto(int id, String nombre, String categoria, int cantidad) {
        this.id = id;
        Nombre = nombre;
        Categoria = categoria;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PRODUCTO --> " +
                " ID: " + id +
                ", NOMBRE: " + Nombre +
                ", CATEGORIA: " + Categoria +
                ", CANTIDAD: " + cantidad;
    }
}
