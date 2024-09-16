
public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private Boolean clienteFrecuente;
    private String direccion;

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.clienteFrecuente = false;
        this.direccion = "";
    }
    public Cliente(String rut, String nombre, String apellido, Boolean clienteFrecuente, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clienteFrecuente = clienteFrecuente;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente(Boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", clienteFrecuente=" + clienteFrecuente + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
