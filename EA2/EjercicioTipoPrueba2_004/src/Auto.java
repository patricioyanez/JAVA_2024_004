
public final class Auto extends Vehiculo {
    private int cantidadPuertas;
    private int capacidadMaletero;

    public Auto() {
        this.cantidadPuertas = 0;
        this.capacidadMaletero = 0;
    }

    public Auto(int cantidadPuertas, int capacidadMaletero, String patente, String nombre, int precioServicioNeto, int iva, int totalPorCobrar) {
        super(patente, nombre, precioServicioNeto, iva, totalPorCobrar);
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantidad de Puertas  = " + cantidadPuertas + 
                "\nCapacidad de Maletero= " + capacidadMaletero;
    }
    
    
    @Override
    public void totalPorPagar() {
        int resultado = this.getPrecioServicioNeto() + this.getIva();
        this.setTotalPorCobrar(resultado);
    }

    @Override
    public void totalConIVA() {
        double resultado = this.getPrecioServicioNeto() * IVA;
        this.setIva((int)resultado);
    }

    @Override
    public void obtenerDescuento() {
        double resultado = this.getPrecioServicioNeto() * DESCUENTO_AUTO;
        resultado = this.getPrecioServicioNeto() - resultado;
        this.setPrecioServicioNeto((int)resultado);
    }
    
    public void obtenerDescuento(double descuento) {
        double resultado = this.getPrecioServicioNeto() * descuento;
        resultado = this.getPrecioServicioNeto() - resultado;
        this.setPrecioServicioNeto((int)resultado);
    }
    
}
