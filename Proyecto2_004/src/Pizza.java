
public class Pizza {
    // atributos
    private String nombre;
    private String masa;
    private String tamano;
    private int precio;
    
    // constructor
    
    
    // getter and setter
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    // crear g and s de los otros atributos

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // metodos personalizados
    public void calcular()
    {
        precio = 11000;
    }
    
    public void imprimirDatos()
    {
        System.out.println("== Datos Pizza ==");
        System.out.println("Nombre  : " + getNombre());
        System.out.println("Masa    : " + getMasa());
        System.out.println("Tamano  : " + getTamano());
        System.out.println("Precio  : " + precio);
    }
}
