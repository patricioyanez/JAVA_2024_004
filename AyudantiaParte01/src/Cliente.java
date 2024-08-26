
public class Cliente {
    
    // atributos
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private int edad;
    
    // constructores
    public Cliente()
    {
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.correo = "";
        this.edad = 0;
        //System.out.println("Cliente creado");
    }
    public Cliente(String rut, String nombre, String apellido, String direccion, String correo, int edad)
    {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
    }
    
    
    // getter and setter
    

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodos personalizado
    public String imprimirDatos() {
        return  "\nRut      = " + rut + 
                "\nNombre   = " + nombre + 
                "\nApellido = " + apellido + 
                "\nDireccion= " + direccion + 
                "\nCorreo   = " + correo + 
                "\nEdad     = " + edad;
    }
    
    
}
