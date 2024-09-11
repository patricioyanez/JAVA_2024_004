
public class Vehiculo {
    private String patente;
    private String marca;
    private int kilometraje;
    private int precioServicio;
    private Cliente cliente;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.kilometraje = 0;
        this.precioServicio = 0;
        this.cliente = null; // new Cliente();
    }
    
    public Vehiculo(String patente, String marca, int kilometraje, int precioServicio, Cliente cliente) {
        this.patente = patente;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.precioServicio = precioServicio;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }


    public String imprimirDatos() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", kilometraje=" + kilometraje + ", precioServicio=" + precioServicio + ", cliente=" + cliente.imprimirDatos() ;
    }
    
    public void descuento()
    {
        if(this.cliente.isEsNuevo() || precioServicio >= 100000)
        {
            //this.precioServicio *= 0.95;
            this.precioServicio = (int)(this.precioServicio * .95);
        }
    }
    public void enviarCorreo()
    {
        String mensaje = "Hola " + getCliente().getNombre() +
                " envio el mensaje al correo " +getCliente().getCorreo()+
                " para indicarle que su vehiculo " + getPatente() +
                " esta listo para retirar.";
        System.out.println(mensaje);
    }
    
}
