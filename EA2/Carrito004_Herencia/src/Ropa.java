
public class Ropa extends Producto{
    private String talla;
    private String color;

    public Ropa() {
        this.talla = "";
        this.color = "";
    }

    public Ropa(String talla, String color, String id, String nombre, int precio) {
        super(id, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTalla    = " + talla + 
                "\nColor    = " + color;
    }
    
    public void ajustarTalla(String nuevaTalla)
    {
        if("s".equalsIgnoreCase(nuevaTalla) ||
            "m".equalsIgnoreCase(nuevaTalla) ||    
            "l".equalsIgnoreCase(nuevaTalla) ||    
            "xl".equalsIgnoreCase(nuevaTalla) ||    
            "xxl".equalsIgnoreCase(nuevaTalla) ||    
            "xxxl".equalsIgnoreCase(nuevaTalla))
            this.talla = nuevaTalla;
        else
            System.out.println("Talla no válida...");
    }
    
}
