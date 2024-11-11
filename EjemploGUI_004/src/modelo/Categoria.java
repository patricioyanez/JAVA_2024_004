
package modelo;


public class Categoria {
    private int id;
    private String nombre;
    private boolean habilitado;

    public Categoria() {
        this.id = 0;
        this.nombre = "";
        this.habilitado = false;
    }
    
    public Categoria(int id, String nombre, boolean habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
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
    
    public void limpiar()
    {
        this.id = 0;
        this.nombre = "";
        this.habilitado = false; 

    }
}
