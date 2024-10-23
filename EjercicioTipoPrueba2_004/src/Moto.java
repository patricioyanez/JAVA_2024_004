
public final class Moto extends Vehiculo {
    private String estilo;
    private int medidaManillar;

    public Moto() {
        this.estilo = "";
        this.medidaManillar = 0;
    }

    public Moto(String estilo, int medidaManillar, String patente, String nombre, int precioServicioNeto, int iva, int totalPorCobrar) {
        super(patente, nombre, precioServicioNeto, iva, totalPorCobrar);
        this.estilo = estilo;
        this.medidaManillar = medidaManillar;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nEstilo               = " + estilo + 
                "\nMedida de Manillar   = " + medidaManillar;
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
        double resultado = this.getPrecioServicioNeto() * DESCUENTO_MOTO;
        resultado = this.getPrecioServicioNeto() - resultado;
        this.setPrecioServicioNeto((int)resultado);
    }
    
    
}
