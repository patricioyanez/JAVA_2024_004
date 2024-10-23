
public abstract class Vehiculo implements IOperaciones {
    private String patente;
    private String nombre;
    
    private int precioServicioNeto;
    private int iva;
    private int totalPorCobrar;

    public Vehiculo() {
        this.patente = "";
        this.nombre = "";
        this.precioServicioNeto = 0;
        this.iva = 0;
        this.totalPorCobrar = 0;
    }
    public Vehiculo(String patente, String nombre, int precioServicioNeto, int iva, int totalPorCobrar) {
        this.patente = patente;
        this.nombre = nombre;
        this.precioServicioNeto = precioServicioNeto;
        this.iva = iva;
        this.totalPorCobrar = totalPorCobrar;
    }

    public int getTotalPorCobrar() {
        return totalPorCobrar;
    }

    public void setTotalPorCobrar(int totalPorCobrar) {
        this.totalPorCobrar = totalPorCobrar;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioServicioNeto() {
        return precioServicioNeto;
    }

    public void setPrecioServicioNeto(int precioServicioNeto) {
        this.precioServicioNeto = precioServicioNeto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return  
                "\nPatente              = " + patente + 
                "\nNombre               = " + nombre + 
                "\nPrecio Servicio Neto = " + precioServicioNeto + 
                "\nIva                  = " + iva + 
                "\nTotal Por Cobrar     = " + totalPorCobrar;
    }
    
    public abstract void totalPorPagar();
}
