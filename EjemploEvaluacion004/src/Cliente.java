
public class Cliente {
    private int rut;
    private String nombre;
    private int codigo;
    private int telefono;
    private String correo;
    private boolean esNuevo;
        
    // constructores/ g & s / metodos personalizados

    public Cliente() {
        this.rut = 0;
        this.nombre = "";
        this.codigo = 0;
        this.telefono = 0;
        this.correo = "";
        this.esNuevo = false;
    }

    public Cliente(int rut, String nombre, int codigo, int telefono, String correo, boolean esNuevo) {
        this.rut = rut;
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.correo = correo;
        this.esNuevo = esNuevo;
    }
    
    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String imprimirDatos() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", codigo=" + codigo + ", telefono=" + telefono + ", correo=" + correo + ", esNuevo=" + esNuevo + '}';
    }
    
    
}
