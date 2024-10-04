
public class Empleado extends Persona{
    private int sueldo;
    private String cargo;

    public Empleado() {
        super();
        this.sueldo = 0;
        this.cargo = "";
    }

    public Empleado(int sueldo, String cargo, String rut, String nombre, int anioNacimiento, String correo) {
        super(rut, nombre, anioNacimiento, correo);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nSueldo   = " + sueldo +
                "\nCargo    = " + cargo;
    }
    
    
}
