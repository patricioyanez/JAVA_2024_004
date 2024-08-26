
public class Componente {
    private int codigo;
    private String descripcion;
    private String marca;
    private String modelo;
    private int precio;
    private int stock;
    
    public Componente() {
        this.codigo = 0;
        this.descripcion = "";
        this.marca = "";
        this.modelo = "";
        this.precio = 0;
        this.stock = 0;
    }
    public Componente(int codigo, String descripcion, String marca, String modelo, int precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String imprimirDatos() {
        return  "\nCodigo       = " + codigo + 
                "\nDescripcion  = " + descripcion + 
                "\nMarca        = " + marca + 
                "\nModelo       = " + modelo + 
                "\nPrecio       = " + precio + 
                "\nStock        = " + stock;
    }
    
    
    
}
