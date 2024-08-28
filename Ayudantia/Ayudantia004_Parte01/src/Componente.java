
public class Componente {
    private int codigo;
    private String marca;
    private String modelo;
    private String tipoComponente;
    private int precio;
    
    public Componente() {
        this.codigo = 0;
        this.marca = "";
        this.modelo = "";
        this.tipoComponente = "";
        this.precio = 0;
    }
    
    public Componente(int codigo, String marca, String modelo, String tipoComponente, int precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoComponente = tipoComponente;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String imprimirDatos() {
        return  "==== Datos del componente ====" + 
                "\nCodigo           = " + codigo + 
                "\nMarca            = " + marca + 
                "\nModelo           = " + modelo + 
                "\nTipo Componente  = " + tipoComponente + 
                "\nPrecio           = " + precio;
    }
    
    
}
