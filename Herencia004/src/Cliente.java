
public class Cliente extends Persona{
    private String tipoCliente; // Vip, Platino normal
    private int montoCredito;

    public Cliente() {
        this.tipoCliente = "normal";
        this.montoCredito = 0;
    }

    public Cliente(String tipoCliente, int montoCredito, String rut, String nombre, int anioNacimiento, String correo) {
        super(rut, nombre, anioNacimiento, correo);
        this.tipoCliente = tipoCliente;
        this.montoCredito = montoCredito;
    }

    public int getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(int montoCredito) {
        this.montoCredito = montoCredito;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nTipo de Cliente = " + tipoCliente + 
                "\nMonto de Crédito= " + montoCredito;
    }

    @Override
    public void calcularEdad() {
        int edad = 2024 - this.getAnioNacimiento();
        System.out.println("Estimado cliente, Ud. tiene " + edad + " años");
    }
    
    
}
