
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int precio;
    private int stock;

    public Producto() {
        this.codigo = 0;
        this.nombre = "";
        this.marca = "";
        this.precio = 0;
        this.stock = 0;
    }
    
    public Producto(int codigo, String nombre, String marca, int precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "\n==== Datos del Producto ====" + 
                "\nCodigo   = " + codigo + 
                "\nNombre   = " + nombre + 
                "\nMarca    = " + marca + 
                "\nPrecio   = " + precio + 
                "\nStock    = " + stock;
    }
    
    
}
