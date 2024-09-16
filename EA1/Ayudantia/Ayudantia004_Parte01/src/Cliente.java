
public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private int edad;

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.email = "";
        this.edad = 0;
    }
    
    public Cliente(String rut, String nombre, String apellido, String direccion, String email, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String imprimirDatos() {
        return  "\n==== Datos del cliente ====" + 
                "\nRut      = " + rut + 
                "\nNombre   = " + nombre + 
                "\nApellido = " + apellido + 
                "\nDirección= " + direccion + 
                "\nEmail    = " + email + 
                "\nEdad     = " + edad;
    }
    
    
}
