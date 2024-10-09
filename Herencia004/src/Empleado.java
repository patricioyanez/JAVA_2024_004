
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

    // metodo sobre escrito
    @Override
    public void calcularEdad() {
        int edad = 2024 - this.getAnioNacimiento();
        System.out.println("La edad del empleado es: " + edad);
    }
    public void calcularEdad(int anio) {
        int edad = anio - this.getAnioNacimiento();
        System.out.println("La edad del empleado es: " + edad);
    } 
    // ejemplo sobre carga
    public void calcularSueldo()
    {
        System.out.println("==== Liquidación de Sueldo ====");
        System.out.println("Sueldo Base     : " + sueldo);
        int afp = (int)(sueldo*.1);
        int salud = (int)(sueldo*.07);                
        System.out.println("AFP             : " + afp);
        System.out.println("Fonasa/Isapre   : " + salud);
        int liquido = sueldo - (afp+salud);        
        System.out.println("Sueldo Liquido  : " + liquido);
    }
    public void calcularSueldo(int descuento)
    {
        System.out.println("==== Liquidación de Sueldo ====");
        System.out.println("Sueldo Base     : " + sueldo);
        int afp = (int)(sueldo*.1);
        int salud = (int)(sueldo*.07);                
        System.out.println("AFP             : " + afp);
        System.out.println("Fonasa/Isapre   : " + salud);
        System.out.println("Descuento       : " +descuento);
        int liquido = sueldo - (afp + salud + descuento);        
        System.out.println("Sueldo Liquido  : " + liquido);
    }
    
}
