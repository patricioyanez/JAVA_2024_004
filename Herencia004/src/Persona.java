
public class Persona {
    private String rut;
    private String nombre;
    private int anioNacimiento;
    private String correo;

    public Persona() {
        this.rut = "";
        this.nombre = "";
        this.anioNacimiento = 0;
        this.correo = "";
    }
    
    public Persona(String rut, String nombre, int anioNacimiento, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return  "\nRut              = " + rut + 
                "\nNombre           = " + nombre + 
                "\nAño Nacimiento   = " + anioNacimiento + 
                "\nCorreo           = " + correo;
    }
    
    // metodo a sobreescribir
    public void calcularEdad()
    {
        int edad = 2024 - this.anioNacimiento;
        System.out.println("La edad de la persona es: " + edad);
    }
}
