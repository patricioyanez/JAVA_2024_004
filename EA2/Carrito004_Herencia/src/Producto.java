
public class Producto {
    private String id;
    private String nombre;
    private int precio;

    public Producto() {
        this.id = "";
        this.nombre = "";
        this.precio = 0;
    }
    
    public Producto(String id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return  "\nId       = " + id + 
                "\nNombre   = " + nombre + 
                "\nPrecio   = " + precio;
    }
    
    public Double calcularDescuento(Double descuento)
    {
        return this.precio - (this.precio * descuento / 100);
    }
}
